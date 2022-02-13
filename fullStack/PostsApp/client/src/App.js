import React, { useEffect, useState } from 'react';
import { Container, AppBar, Typography, Grow, Grid, Button } from '@material-ui/core';
import { useDispatch } from 'react-redux';

import { getPosts } from './actions/post'
import Form from './components/Form/Form';
import Posts from './components/Posts/Posts';
import iconLogo from './images/icon2.png';
import SunIcon from '@material-ui/icons/WbSunny';
import MoonIcon from '@material-ui/icons/NightsStaySharp'

import useStyles from './style';

const App = () => {
  const [currentId, setCurrentId] = useState(null);
  const [darkMode, setDarkMode] = useState();
  const classes = useStyles();
  const dispatch = useDispatch();

  useEffect(() => {
    dispatch(getPosts());
    if (darkMode) {
      return document.body.style.background = '#333';
    } else {
      return document.body.style.background = '#eee';
    }
  }, [currentId, dispatch, darkMode])

  return (
    <Container maxWidth='lg' className={classes.app}>
      <Button size='small' style={darkMode ? { backgroundColor: '#00b0ff', color: "#cddc39" } : { backgroundColor: '#3f51b5', color: '#d500f9' }} onClick={() => setDarkMode(!darkMode)}>
        {darkMode ? <SunIcon fontSize='medium' /> : <MoonIcon fontSize='medium' />}
      </Button>
      <AppBar className={darkMode ? classes.darkAppBar : classes.appBar} position='static' color='inherit'>
        {/* basics on h1-6 or p etc. Generally on texts // Bazuje na tekstach*/}
        <Typography className={darkMode ? classes.darkHeading : classes.heading} variant='h2' align='center'>Memories Post App</Typography>
        <img className={classes.image} src={iconLogo} alt="iconLogo" height='60' />
      </AppBar>
      {/* Provise simple animations // Zapewnia proste animacje */}
      <Grow in>
        <Container>
          {/* Ten grid posluzy jako container dla itemow w nim. Inaczej jako rodzic, a w nim dzieci */}
          <Grid container justifyContent='space-between' alignItems='stretch' spacing={3}>
            <Grid item xs={12} sm={4}>
              <Form currentId={currentId} setCurrentId={setCurrentId} darkMode={darkMode} />
            </Grid>
            <Grid item xs={12} sm={7}>
              <Posts setCurrentId={setCurrentId} darkMode={darkMode} />
            </Grid>
          </Grid>
        </Container>
      </Grow>
    </Container>
  );
}

export default App;