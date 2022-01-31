import React, { useState } from 'react';

import Navigation from '../pages/Navigation'

const NavBar = (props) => {
  const navbarStyles = {
    width: "100%",
    height: "50px",
    backgroundColor: '#FFF89C',
    textAlign: 'right',
    display: 'inline-block',
    transition: '0.5s',
  }
  const activeNavbarStyles = {
    width: "75%",
    height: "50px",
    backgroundColor: '#FFF89A',
    textAlign: 'right',
    display: 'inline-block',
    transition: '0.5s',
  }

  const buttonStyles = {
    display: 'inline-block',
    width: '40px',
    height: '40px',
    marginTop: '5px',
    marginRight: '10px',

  }
  const activeButtonStyle = {
    display: 'inline-block',
    width: '40px',
    height: '40px',
    marginTop: '5px',
    marginRight: '10px',
    backgroundColor: '#1a0000',
    transition: '0.5s',
  }
  const divDialogStyle = {
    display: 'block',
    float: 'left',
    height: '100%',
    marginLeft: '5%',
  }
  const pDialogStyle = {
    fontSize: '20px',
    lineHeight: '200%',
    fontWeight: 'bold',
  }

  const [isHideNav, setIsHideNav] = useState(false);

  const handleHideNab = () => setIsHideNav(!isHideNav);

  return (
    <div className="Navbar" style={isHideNav ? activeNavbarStyles : navbarStyles}>
      <div style={divDialogStyle}><p style={pDialogStyle}>Welcome to my react project</p></div>
      <button style={isHideNav ? activeButtonStyle : buttonStyles} onClick={handleHideNab}><p style={isHideNav ? { color: '#0066cc' } : null}>x</p></button>
      <Navigation isHideNav={isHideNav} />
    </div>
  );
}

export default NavBar;