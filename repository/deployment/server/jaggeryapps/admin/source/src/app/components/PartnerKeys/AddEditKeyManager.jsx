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

import React, { useReducer, useState, useEffect } from 'react';
import PropTypes from 'prop-types';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';
import Checkbox from '@material-ui/core/Checkbox';
import ChipInput from 'material-ui-chip-input';
import ContentBase from 'AppComponents/AdminPages/Addons/ContentBase';
import { useIntl, FormattedMessage } from 'react-intl';
import Box from '@material-ui/core/Box';
import Grid from '@material-ui/core/Grid';
import { Link as RouterLink } from 'react-router-dom';
import RadioGroup from '@material-ui/core/RadioGroup';
import clsx from 'clsx';
import Radio from '@material-ui/core/Radio';
import {
    Typography, FormControlLabel, MenuItem,
} from '@material-ui/core';
import API from 'AppData/api';
import Alert from 'AppComponents/Shared/Alert';
import { useAppContext } from 'AppComponents/Shared/AppContext';
import Button from '@material-ui/core/Button';
import CircularProgress from '@material-ui/core/CircularProgress';


const useStyles = makeStyles((theme) => ({
    root: {
        marginBottom: theme.spacing(10),
    },
    error: {
        color: theme.palette.error.dark,
    },
    hr: {
        border: 'solid 1px #efefef',
    },
    labelRoot: {
        position: 'relative',
    },
    FormControlRoot: {
        width: '100%',
    },
    select: {
        padding: '10.5px 14px',
    },
    chipInputRoot: {
        border: 'solid 1px #ccc',
        borderRadius: 10,
        padding: 10,
        width: '100%',
        '& :before': {
            borderBottom: 'none',
        },
    },
    '@global': {
        '.MuiFormControl-root': {
            marginTop: '20px',
        },
        '.MuiFormControl-root:first-child': {
            marginTop: '0',
        },
    },
    chipHelper: {
        position: 'absolute',
        marginTop: '-5px',
    },
    chipContainer: {
        marginBottom: 8,
    },
    importButton: {
        position: 'absolute',
        top: 0,
        right: 0,
        display: 'flex',
        flexDirection: 'row',
        textAlign: 'right',
        alignItems: 'center',
        paddingTop: 10,
        '& p': {
            marginRight: 10,
        },
    },
    expand: {
        transform: 'rotate(0deg)',
        marginLeft: 'auto',
        transition: theme.transitions.create('transform', {
            duration: theme.transitions.duration.shortest,
        }),
    },
    expandOpen: {
        transform: 'rotate(180deg)',
    },
}));

const residentKeyManagerName = 'Resident Key Manager';

/**
 * Reducer
 * @param {JSON} state The second number.
 * @returns {Promise}
 */
function reducer(state, newValue) {
    const { field, value } = newValue;
    switch (field) {
        case 'userName':
        case 'firstPublicKey':
        case 'secondPublicKey':
        case 'userPartner':
            return { ...state, [field]: value };
        default:
            return newValue;
    }
}

/**
 * Render a list
 * @returns {JSX} Header AppBar components.
 */
function AddEditKeyManager(props) {
    const classes = useStyles();
    const intl = useIntl();
    const [saving, setSaving] = useState(false);
    const [importingConfig, setImportingConfig] = useState(false);
    const { match: { params: { id } }, history } = props;
    const { settings } = useAppContext();

    const [initialState] = useState({
        userName: '',
        firstPublicKey: '',
        secondPublicKey: '',
        userPartner: '',
    });
    const [state, dispatch] = useReducer(reducer, initialState);
    const {
        userName, firstPublicKey, secondPublicKey, userPartner
    } = state;
    const [validating, setValidating] = useState(false);
    const restApi = new API();

    const hasErrors = (fieldName, fieldValue, validatingActive) => {
        let error = false;
        if (!validatingActive) {
            return (false);
        }

        switch (fieldName) {
            case 'userName':
                if (fieldValue === '') {
                    error = `User Name ${intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.is.empty.error',
                        defaultMessage: ' is empty',
                    })}`;
                } else if (fieldValue !== '' && /\s/g.test(fieldValue)) {
                    error = intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.space.error',
                        defaultMessage: 'User name contains white spaces.',
                    });
                }
                break;
            case 'firstPublicKey':
                if (fieldValue === '') {
                    error = `Public Key 1 ${intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.is.empty.error',
                        defaultMessage: ' is empty',
                    })}`;
                } else if (fieldValue !== '' && /\s/g.test(fieldValue)) {
                    error = intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.space.error',
                        defaultMessage: 'PublicKey 1 contains white spaces.',
                    });
                }
                break;
            case 'secondPublicKey':
                if (fieldValue === '') {
                    error = `Public Key 2 ${intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.is.empty.error',
                        defaultMessage: ' is empty',
                    })}`;
                } else if (fieldValue !== '' && /\s/g.test(fieldValue)) {
                    error = intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.space.error',
                        defaultMessage: 'PublicKey 2 contains white spaces.',
                    });
                }
                break;
            case 'userPartner':
                if (fieldValue === '') {
                    error = `User Partner ${intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.is.empty.error',
                        defaultMessage: ' is empty',
                    })}`;
                } else if (fieldValue !== '' && /\s/g.test(fieldValue)) {
                    error = intl.formatMessage({
                        id: 'PartnerKeys.AddEditKeyManager.space.error',
                        defaultMessage: 'User Partner contains white spaces.',
                    });
                }
                break;
            default:
                break;
        }
        return error;
    };
    const onChange = (e) => {
        dispatch({ field: e.target.name, value: e.target.value });
    };
    const formHasErrors = (validatingActive = false) => {
        if (hasErrors('userName', userName, validatingActive)
            || hasErrors('firstPublicKey', firstPublicKey, validatingActive)
            || hasErrors('secondPublicKey', secondPublicKey, validatingActive)
            || hasErrors('userPartner', userPartner, validatingActive)
        ) {
            return true;
        } else {
            return false;
        }
    };
    const formSaveCallback = () => {
        setValidating(true);
        if (formHasErrors(true)) {
            Alert.error(intl.formatMessage({
                id: 'PartnerKeys.AddEditKeyManager.form.has.errors',
                defaultMessage: 'One or more fields contain errors.',
            }));
            return false;
        }
        setSaving(true);

        const partnerKey = {
            ...state,
        };

        console.log(partnerKey);

        let url = 'https://devportal-am.sacombank.local/api/am/store/v1/user/publickey';
        let user = 'admin';
        let password = 'admin';

        const headers = {
            'Authorization': 'Basic ' + Buffer.from(user + ":" + password).toString('base64'),
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        };

        fetch(url, {
            method: 'POST',
            trusty: true,
            headers: headers,
            //mode: 'no-cors',
            body: JSON.stringify({
                'userPartner': partnerKey.userPartner,
                'publickey1': partnerKey.firstPublicKey,
                'publickey2': partnerKey.secondPublicKey,
                'userName': partnerKey.userName,
            })
        }).then((res) => {
            console.log(res);

            if (res.ok) {                
                return true;
            }
        }).then((res) => {
            setSaving(false);
        })

        history.push('/settings/partner-keys/');
        return true;
    };

    return (
        <ContentBase
            pageStyle='half'
            title={
                id ? `${intl.formatMessage({
                    id: 'PartnerKeys.AddEditKeyManager.title.edit',
                    defaultMessage: 'Partner Key - Edit ',
                })} ${userName}` : intl.formatMessage({
                    id: 'PartnerKeys.AddEditKeyManager.title.new',
                    defaultMessage: 'Partner Key - Create new',
                })
            }
            help={<div />}
        >
            <Box component='div' m={2} className={classes.root}>
                <Grid container spacing={2}>
                    <Grid item xs={12} md={12} lg={12}>
                        <Box component='div' m={1}>
                            <TextField
                                autoFocus
                                margin='dense'
                                name='userName'
                                label={(
                                    <span>
                                        <FormattedMessage
                                            id='PartnerKeys.AddEditKeyManager.form.userName'
                                            defaultMessage='User Name'
                                        />
                                        <span className={classes.error}>*</span>
                                    </span>
                                )}
                                fullWidth
                                variant='outlined'
                                value={userName}
                                onChange={onChange}
                                error={hasErrors('userName', userName, validating)}
                                helperText={hasErrors('userName', userName, validating) || intl.formatMessage({
                                    id: 'PartnerKeys.AddEditKeyManager.form.userName.help',
                                    defaultMessage: 'User Name.',
                                })}
                            />
                            <TextField
                                autoFocus
                                margin='dense'
                                name='firstPublicKey'
                                label={(
                                    <span>
                                        <FormattedMessage
                                            id='PartnerKeys.AddEditKeyManager.form.firstPublicKey'
                                            defaultMessage='Public Key 1'
                                        />
                                        <span className={classes.error}>*</span>
                                    </span>
                                )}
                                fullWidth
                                variant='outlined'
                                value={firstPublicKey}
                                onChange={onChange}
                                error={hasErrors('firstPublicKey', firstPublicKey, validating)}
                                helperText={hasErrors('firstPublicKey', firstPublicKey, validating) || intl.formatMessage({
                                    id: 'PartnerKeys.AddEditKeyManager.form.firstPublicKey.help',
                                    defaultMessage: 'Public Key 1.',
                                })}
                            />
                            <TextField
                                autoFocus
                                margin='dense'
                                name='secondPublicKey'
                                label={(
                                    <span>
                                        <FormattedMessage
                                            id='PartnerKeys.AddEditKeyManager.form.secondPublicKey'
                                            defaultMessage='Public Key 2'
                                        />
                                        <span className={classes.error}>*</span>
                                    </span>
                                )}
                                fullWidth
                                variant='outlined'
                                value={secondPublicKey}
                                onChange={onChange}
                                error={hasErrors('secondPublicKey', secondPublicKey, validating)}
                                helperText={hasErrors('secondPublicKey', secondPublicKey, validating) || intl.formatMessage({
                                    id: 'KeyManagers.AddEditKeyManager.form.secondPublicKey.help',
                                    defaultMessage: 'Public Key 2.',
                                })}
                            />
                            <TextField
                                autoFocus
                                margin='dense'
                                name='userPartner'
                                label={(
                                    <span>
                                        <FormattedMessage
                                            id='PartnerKeys.AddEditKeyManager.form.userPartner'
                                            defaultMessage='User Partner'
                                        />
                                        <span className={classes.error}>*</span>
                                    </span>
                                )}
                                fullWidth
                                variant='outlined'
                                value={userPartner}
                                onChange={onChange}
                                error={hasErrors('userPartner', userPartner, validating)}
                                helperText={hasErrors('userPartner', userPartner, validating) || intl.formatMessage({
                                    id: 'PartnerKeys.AddEditKeyManager.form.userPartner.help',
                                    defaultMessage: 'User Partner.',
                                })}
                            />
                        </Box>
                    </Grid>
                    <Grid item xs={12}>
                        <Box marginTop={2} marginBottom={2}>
                            <hr className={classes.hr} />
                        </Box>
                    </Grid>
                    <Grid item xs={12}>
                        <Box component='span' m={1}>
                            <Button variant='contained' color='primary' onClick={formSaveCallback}>
                                {saving ? (<CircularProgress size={16} />) : (
                                    <>
                                        {id ? (
                                            <FormattedMessage
                                                id='KeyManagers.AddEditKeyManager.form.update.btn'
                                                defaultMessage='Update'
                                            />
                                        ) : (
                                            <FormattedMessage
                                                id='KeyManagers.AddEditKeyManager.form.add'
                                                defaultMessage='Add'
                                            />
                                        )}
                                    </>
                                )}
                            </Button>
                        </Box>
                        <RouterLink to='/settings/partner-keys'>
                            <Button variant='contained'>
                                <FormattedMessage
                                    id='KeyManagers.AddEditKeyManager.form.cancel'
                                    defaultMessage='Cancel'
                                />
                            </Button>
                        </RouterLink>
                    </Grid>
                </Grid>
            </Box>


        </ContentBase>
    );
}

AddEditKeyManager.defaultProps = {
    dataRow: null,
};

AddEditKeyManager.propTypes = {
    dataRow: PropTypes.shape({
        id: PropTypes.string.isRequired,
        description: PropTypes.string.isRequired,
        label: PropTypes.string.isRequired,
    }),
    triggerButtonText: PropTypes.shape({}).isRequired,
    title: PropTypes.shape({}).isRequired,
};

export default AddEditKeyManager;
