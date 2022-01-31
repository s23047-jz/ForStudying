import React, { Suspense } from 'react';

import Model from './Model';

import './../../styles/pages/Header.scss'

const Header = () => {

  const headerStyles = {
    width: '100%',
    height: '50vh',
    backgroundColor: '#FFC900',
  }
  const object3dStyle = {
    margin: '0 auto',
    width: '80%',
    height: '70%',
    backgroundColor: '#1A5F7A',
    border: '2px solid #1A5F7A',
    borderRadius: '20px',
  }
  const aboutTextStyle = {
    margin: '5px auto 0',
    width: '80%',
    height: '25%',
    marginTop: '10px',
    backgroundColor: '#FFF89A',
    border: '2px solid #FFF89A',
    borderRadius: '20px',
    textAlign: 'center',
  }
  const darkHeaderStyles = {
    width: '100%',
    height: '50vh',
    backgroundColor: '#FFC900',
  }
  const darkObject3dStyle = {
    margin: '0 auto',
    width: '80%',
    height: '70%',
    backgroundColor: '#1A5F7A',
    border: '2px solid #1A5F7A',
    borderRadius: '20px',
  }
  const darkOboutTextStyle = {
    margin: '5px auto 0',
    width: '80%',
    height: '25%',
    marginTop: '10px',
    backgroundColor: '#FFF89A',
    border: '2px solid #FFF89A',
    borderRadius: '20px',
    textAlign: 'center',
  }

  return (
    <header>
      <div className='header' style={headerStyles}>
        <div className='img'>
          <p>There should be 3d object with Three Js but...</p>
        </div>
        <div className='about' style={aboutTextStyle}>
          <p style={{ fontSize: '25px' }}>Hello 😊</p>
          <p style={{ fontSize: '15px' }}>My name is Jacob. I'm a begginer fullstack developer. Enjoying viewing my webpage. 🙋‍♂️🙋‍♀️</p>
        </div>
      </div>
    </header >
  );
}

export default Header;