import React from 'react';
import { Switch, Route } from 'react-router-dom';

import HomePage from '../pages/HomePage';
import MyWorksPage from '../pages/MyWorksPage';
import LoginPage from '../pages/LoginPage';
import ErrorPage from '../pages/ErrorPage';

const Page = (props) => {
  return (
    <Switch>
      <Route path='/' exact component={HomePage} />
      <Route path='/my_works' component={MyWorksPage} />
      <Route path='/login' component={LoginPage} />
      <Route component={ErrorPage} />
    </Switch>
  );
}

export default Page;