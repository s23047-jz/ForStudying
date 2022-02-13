import React from 'react';
import { Grid, CircularProgress } from '@material-ui/core';
import { useSelector } from 'react-redux';

import useStyles from './style';
import Post from './Post/Post';

const Posts = ({ setCurrentId, darkMode }) => {
  const posts = useSelector((state) => state.posts);
  const classes = useStyles();

  console.log(posts);

  return (
    !posts.length ? <CircularProgress /> : (
      <Grid className={classes.mainContainer} container alignItems='stretch' spacing={3} >
        {posts.map(post => (
          <Grid item key={post._id} xs={12} sm={6}>
            <Post post={post} setCurrentId={setCurrentId} darkMode={darkMode} />
          </Grid>
        ))}
      </Grid>
    )
  );
}

export default Posts;