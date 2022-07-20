import React from 'react';
import { withRouter, Switch, Route } from 'react-router-dom';
import ResourceNotFound from 'AppComponents/Base/Errors/ResourceNotFound';
import ListKeyManagers from './ListKeyManagers';
import AddEditKeyManager from './AddEditKeyManager';

/**
 * Render a list
 * @returns {JSX} Header AppBar components.
 */
function KeyManagers() {
    return (
        <Switch>
            <Route exact path='/settings/partner-keys' component={ListKeyManagers} />
            <Route exact path='/settings/partner-keys/create' component={AddEditKeyManager} />
            <Route exact path='/settings/partner-keys/:id' component={AddEditKeyManager} />
            <Route component={ResourceNotFound} />
        </Switch>
    );
}

export default withRouter(KeyManagers);
