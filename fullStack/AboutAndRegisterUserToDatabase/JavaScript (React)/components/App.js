import { useState } from 'react';
import { BrowserRouter as Router } from 'react-router-dom';

import NavBar from './layouts/NavBar';
import Header from './layouts/Header'
import Page from './layouts/Page';
import Footer from './layouts/Footer';

import './../styles/style.scss'

const App = () => {

  return (
    <Router>
      <div className="App">
        <NavBar />
        <Header />
        <Page />
        <Footer />
      </div>
    </Router>
  );
}

export default App;