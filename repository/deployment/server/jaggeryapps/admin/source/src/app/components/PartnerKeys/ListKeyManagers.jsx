/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import React, { useState } from 'react';
import API from 'AppData/api';
import { useIntl, FormattedMessage } from 'react-intl';
import Typography from '@material-ui/core/Typography';
import ListBase from 'AppComponents/AdminPages/Addons/ListBase';
import { Link as RouterLink } from 'react-router-dom';
import Button from '@material-ui/core/Button';
import Alert from 'AppComponents/Shared/Alert';
import Switch from '@material-ui/core/Switch';

/**
 * API call to get microgateway labels
 * @returns {Promise}.
 */
function apiCallCustom() {
    var config = require('Config');

    var CryptoJS = require("crypto-js");

    var userNameBytes = CryptoJS.AES.decrypt(config.app.userName, config.app.encKey);
    var userNameDec = userNameBytes.toString(CryptoJS.enc.Utf8);

    var passwordBytes = CryptoJS.AES.decrypt(config.app.password, config.app.encKey);
    var passwordDec = passwordBytes.toString(CryptoJS.enc.Utf8);

    let user = userNameDec;
    let password = passwordDec;

    const headers = { 'Authorization': 'Basic ' + Buffer.from(user + ":" + password).toString('base64') };

    return fetch(config.app.getPublicKeysUrl, {
        method: 'GET',
        headers: headers,
        trusty: true
    })
        .then(res => {
            return res.json();
        })
        .then(keys => {
            return keys;
        }
        ).catch((error) => {
            throw error;
        });
}

function apiCall() {
    const restApi = new API();
    return restApi
        .getKeyManagersList()
        .then((result) => {
            return result.body.list;
        })
        .catch((error) => {
            throw error;
        });
}

/**
 * Render a list
 * @returns {JSX} Header AppBar components.
 */
export default function ListKeyManagers() {
    // eslint-disable-next-line no-unused-vars
    const [saving, setSaving] = useState(false);
    const intl = useIntl();
    const columProps = [
        {
            name: 'userName', label: intl.formatMessage({
                id: 'PartnerKeys.ListPartnerKeys.table.header.label.username',
                defaultMessage: 'UserName',
            }),
            options: {
                sort: false,
            },
        },
        {
            name: 'publickey1', label: intl.formatMessage({
                id: 'PartnerKeys.ListPartnerKeys.table.header.label.publickey1',
                defaultMessage: 'Public Key 1',
            }),
            options: {
                sort: false,
            },
        },
        {
            name: 'publickey2', label: intl.formatMessage({
                id: 'PartnerKeys.ListPartnerKeys.table.header.label.publickey2',
                defaultMessage: 'Public Key 2',
            }),
            options: {
                sort: false,
            },
        },
        {
            name: 'userPartner', label: intl.formatMessage({
                id: 'PartnerKeys.ListPartnerKeys.table.header.label.userpartner',
                defaultMessage: 'UserPartner',
            }),
            options: {
                sort: false,
            },
        },
    ];
    const addButtonProps = {
        triggerButtonText: intl.formatMessage({
            id: 'KeyManagers.ListKeyManagers.List.addButtonProps.triggerButtonText',
            defaultMessage: 'Add KeyManager',
        }),
        /* This title is what as the title of the popup dialog box */
        title: intl.formatMessage({
            id: 'KeyManagers.ListKeyManagers.List.addButtonProps.title',
            defaultMessage: 'Add KeyManager',
        }),
    };
    const pageProps = {
        pageStyle: 'half',
        title: intl.formatMessage({
            id: 'KeyManagers.ListKeyManagers.List.title',
            defaultMessage: 'Key Managers',
        }),
    };
    const addButtonOverride = (
        <RouterLink to='/settings/partner-keys/create'>
            <Button variant='contained' color='primary' size='small'>
                <FormattedMessage
                    id='PartnerKeys.ListKeyManagers.addButtonProps.triggerButtonText'
                    defaultMessage='Add Partner Key'
                />
            </Button>
        </RouterLink>
    );
    const emptyBoxProps = {
        content: (
            <Typography variant='body2' color='textSecondary' component='p'>
                <FormattedMessage
                    id='AdminPages.KeyManagers.List.empty.content.keymanagers'
                    defaultMessage='It is possible to register an OAuth Provider.'
                />
            </Typography>
        ),
        title: (
            <Typography gutterBottom variant='h5' component='h2'>
                <FormattedMessage
                    id='KeyManagers.ListKeyManagers.empty.title'
                    defaultMessage='Key Managers'
                />
            </Typography>
        ),
    };
    const addedActions = [
        (props) => {
            const { rowData, updateList } = props;
            const updateSomething = () => {
                const restApi = new API();
                const kmName = rowData[0];
                const kmId = rowData[4];
                restApi.keyManagerGet(kmId).then((result) => {
                    let editState;
                    if (result.body.name !== null) {
                        editState = {
                            ...result.body,
                        };
                    }
                    editState.enabled = !editState.enabled;
                    restApi.updateKeyManager(kmId, editState).then(() => {
                        Alert.success(` ${kmName} ${intl.formatMessage({
                            id: 'KeyManagers.ListKeyManagers.edit.success',
                            defaultMessage: ' Key Manager updated successfully.',
                        })}`);
                        setSaving(false);
                        updateList();
                    }).catch((e) => {
                        const { response } = e;
                        if (response.body) {
                            Alert.error(response.body.description);
                        }
                        setSaving(false);
                        updateList();
                    });
                });
            };
            const kmEnabled = rowData[3];

            return (
                <Switch
                    checked={kmEnabled}
                    onChange={updateSomething}
                    color='primary'
                    size='small'
                />
            );
        },
    ];
    return (
        <ListBase
            columProps={columProps}
            pageProps={pageProps}
            addButtonProps={addButtonProps}
            addButtonOverride={addButtonOverride}
            emptyBoxProps={emptyBoxProps}
            apiCall={apiCallCustom}
        />
    );
}
