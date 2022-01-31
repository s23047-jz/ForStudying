import React from 'react';

import { NavLink } from 'react-router-dom';


const Navigation = ({ isHideNav }) => {
  const navStyle = {
    position: 'fixed',
    top: 0,
    right: '-25%',
    height: '100%',
    width: '25%',
    backgroundColor: '#086E7D',
    transition: '0.5s',
  }
  const activeNavStyle = {
    position: 'fixed',
    top: 0,
    right: 0,
    height: '100%',
    width: '25%',
    backgroundColor: '#086E7D',
    transition: '0.5s',
  }
  const ulStyle = {
    widht: '100%',
  }
  const liStyle = {
    display: 'block',
    height: '50px',
    width: '100%',
    marginTop: '10px',
    textAlign: 'center'
  }
  const aStyle = {
    lineHeight: '50px',
    width: "100%",
    fontSize: "30px",
    color: '#000',
    textTransform: 'uppercase',
    textDecoration: 'none'
  }

  const pageLists = [
    { name: 'home', path: '/', exact: true },
    { name: 'my works', path: '/my_works' },
    { name: 'login', path: '/login' },
  ]

  const menuList = pageLists.map(link => (
    <li key={link.name} style={liStyle}>
      <NavLink to={link.path} exact={link.exact ? link.exact : false} style={aStyle}>{link.name}</NavLink>
    </li>
  ))

  return (
    <div>
      <div className='navigation' style={isHideNav ? activeNavStyle : navStyle}>
        <ul style={ulStyle}>
          {menuList}
        </ul>
      </div>
    </div>
  );
}

export default Navigation;