/* eslint-disable react/jsx-props-no-spreading */
/* eslint-disable react/prop-types */
/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
import React, { useState, useEffect } from 'react';
import { FormattedMessage, injectIntl } from 'react-intl';
import { withStyles } from '@material-ui/core/styles';
import { TextField, Button, Typography } from '@material-ui/core';
import Grid from '@material-ui/core/Grid';

const styles = (theme) => ({
    content: {
        color: theme.palette.getContrastText(theme.palette.background.default),
    },
    textField: {
        marginTop: 0,
        marginRight: 5,
        width: '100%',
    },
    paper: {
        padding: theme.spacing(2),
        color: theme.palette.text.secondary,
        minHeight: 400,
        position: 'relative',
    },
    paperMenu: {
        color: theme.palette.text.secondary,
        minHeight: 400 + theme.spacing(4),
        height: '100%',
    },
    contentWrapper: {
        paddingLeft: theme.spacing(3),
        paddingRight: theme.spacing(3),
        paddingTop: theme.spacing(3),
    },
    docContent: {
        paddingTop: theme.spacing(1),
    },
    parentListItem: {
        borderTop: 'solid 1px #ccc',
        borderBottom: 'solid 1px #ccc',
        color: theme.palette.grey[100],
        background: theme.palette.grey[100],
        cursor: 'default',
    },
    listRoot: {
        paddingTop: 0,
    },
    nested: {
        paddingLeft: theme.spacing(3),
        paddingTop: 3,
        paddingBottom: 3,
    },
    childList: {
        paddingTop: 0,
        marginTop: 0,
        paddingBottom: 0,
    },
    contentWrapper: {
        maxWidth: theme.custom.contentAreaWidth,
        paddingLeft: theme.spacing(3),
        paddingTop: theme.spacing(3),
    },
    titleSub: {
        marginLeft: theme.spacing(3),
        paddingTop: theme.spacing(2),
        paddingBottom: theme.spacing(2),
        color: theme.palette.getContrastText(theme.palette.background.default),
    },
    generateCredentialWrapper: {
        marginLeft: 0,
        paddingTop: theme.spacing(2),
        paddingBottom: theme.spacing(2),
    },
    genericMessageWrapper: {
        margin: theme.spacing(2),
    },
    typeText: {
        color: '#000',
    },
    docLinkRoot: {
        paddingLeft: 0,
    },
    toggler: {
        height: '100%',
        paddingTop: 20,
        cursor: 'pointer',
        marginLeft: '-20px',
        display: 'block',
    },
    togglerTextParent: {
        writingMode: 'vertical-rl',
        transform: 'rotate(180deg)',
    },
    togglerText: {
        textOrientation: 'sideways',
    },
    toggleWrapper: {
        position: 'relative',
        background: '#fff9',
        paddingLeft: 20,
    },
    docsWrapper: {
        margin: 0,
    },
    docContainer: {
        display: 'flex',
        marginLeft: theme.spacing(3),
        marginRight: theme.spacing(2),
        marginTop: theme.spacing(2),
    },
    docListWrapper: {
        width: 285,
    },
    docView: {
        flex: 1,
    },
    listItemRoot: {
        minWidth: 30,
    },
    contentWrapper: {
        maxWidth: theme.custom.contentAreaWidth,
        paddingLeft: theme.spacing(2),
        paddingTop: theme.spacing.unig,
        marginTop: theme.spacing(2),
    },
    dialogContainer: {
        width: 1000,
        padding: theme.spacing(2),
    },
    commentAddButton: {
        '& span.MuiButton-label': {
            color: theme.palette.getContrastText(theme.palette.primary.main),
        },
    },
    commentAddWrapper: {
        display: 'flex',
        alignItems: 'top',
    },
});

/**
 * Switch routes for documents.
 * @param {JSON} props The props passed down from parents.
 * @returns {JSX} Returning JSX to render.
 */
function PublicKey(props) {
    const { classes } = props;
    const [publickey, setPublicKey] = useState(null);

    useEffect(() => {
        GetPublicKey().then((res) => { console.log(res); setPublicKey(res.publickey1); });
    }, []);

    return (
        <>
            <div>
                <Typography variant='h4' className={classes.titleSub}>
                    <FormattedMessage
                        id='Apis.Details.PublicKey.PublicKey.title'
                        defaultMessage='Public Key'
                    />
                </Typography>
                <Grid container spacing={3} className={classes.contentWrapper}>
                    <Grid item xs zeroMinWidth>
                        <div className={classes.commentAddWrapper}>
                            <TextField
                                id='id-public-key'
                                autoFocus
                                multiline
                                className={classes.textField}
                                margin='normal'
                                label={""}
                                placeholder={""}
                                value={publickey}
                                variant='outlined'
                                disabled={true}
                            />
                        </div>
                        <Grid container spacing={1}>
                            <Grid item>
                                <button type='button' onClick={Download} class={"MuiButtonBase-root MuiButton-root MuiButton-contained Credentials-buttonElm-169 MuiButton-containedPrimary"}>
                                    <FormattedMessage
                                        id='GetPublicKey'
                                        defaultMessage='Get Public Key'
                                    />
                                </button>
                            </Grid>
                        </Grid>
                    </Grid>
                </Grid>
            </div>
        </>
    );
}

function GetPublicKey() {
    var config = require('../../../../../../../../admin/site/public/conf/settings.js');
    var CryptoJS = require("crypto-js");
    var userNameBytes = CryptoJS.AES.decrypt(config.app.userName, config.app.encKey);
    var userNameDec = userNameBytes.toString(CryptoJS.enc.Utf8);

    var passwordBytes = CryptoJS.AES.decrypt(config.app.password, config.app.encKey);
    var passwordDec = passwordBytes.toString(CryptoJS.enc.Utf8);

    let user = userNameDec;
    let password = passwordDec;

    const headers = { 'Authorization': 'Basic ' + Buffer.from(user + ":" + password).toString('base64') };

    return fetch(config.app.getPublicKeyUrl, {
        method: 'GET',
        headers: headers,
        trusty: true
    })
        .then(res => {
            return res.json();
        })
        .then(keys => {
            return keys;
        })
        .catch((error) => {
            throw error;
        });
}

function Download() {
    console.log(document.getElementById('id-public-key').value);
    
    var element = document.createElement('a');
    element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(document.getElementById('id-public-key').value));
    element.setAttribute('download', 'Sacombank-PublicKey.txt');

    element.style.display = 'none';
    document.body.appendChild(element);

    element.click();

    document.body.removeChild(element);
}

export default injectIntl(withStyles(styles)(PublicKey));