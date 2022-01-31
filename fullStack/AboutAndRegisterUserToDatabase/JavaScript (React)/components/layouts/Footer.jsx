import React from 'react';

const Footer = () => {

  const footerStyler = {
    position: 'relative',
    bottom: 0,
    right: 0,
    marginTop: '20px',
    width: "100%",
    height: '50px',
    backgroundColor: '#1a5f7a',
    textAlign: 'center',
    color: '#fff',
  }

  const textFooterStyler = {
    fontSize: '20px',
    lineHeight: '50px'

  }

  return (
    <footer style={footerStyler}>
      <p style={textFooterStyler}>I'm still learning and I'm going to get better at what I like to do</p>
    </footer>
  );
}

export default Footer;