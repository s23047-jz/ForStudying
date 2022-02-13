import React from 'react'
import { useDispatch } from 'react-redux';

import { Card, CardActions, CardContent, CardMedia, Button, Typography } from '@material-ui/core';
import ThumbUpAltIcon from '@material-ui/icons/ThumbUpAlt';
import DeleteIcon from '@material-ui/icons/Delete';
import MoreHorzIcon from '@material-ui/icons/MoreHoriz';
import moment from 'moment'

import { deletePost, likePost } from '../../../actions/post';

import useStyles from './style';

const Post = ({ post, setCurrentId, darkMode }) => {
  const classes = useStyles();
  const dispatch = useDispatch();
  return (
    <Card className={darkMode ? classes.darkCard : classes.card}>
      <CardMedia className={classes.media} image={post.selectedFile} title={post.title} alt="Coding" />
      <div className={classes.overlay}>
        <Typography variant='h5'>{post.creator}</Typography>
        {/* moment umozlimi nam manipulowaniem, formatowaniem itd date */}
        <Typography variant='body2'>{moment(post.createdAt).fromNow()}</Typography>
      </div>
      <div className={classes.overlay2}>
        <Button style={{ color: 'white' }} size='small' onClick={() => setCurrentId(post._id)} >
          <MoreHorzIcon fontSize='medium' />
        </Button>
      </div>
      <div className={classes.details}>
        <Typography variant='body2' >{post.tags.map(tag => `#${tag} `)}</Typography>
      </div>
      <Typography className={classes.title} variant='h5' gutterBottom>{post.title}</Typography>
      <CardContent>
        <Typography variant='body2' className={classes.userMessage} component='p'>{post.message}</Typography>
      </CardContent>
      <CardActions className={classes.cardActions} >
        <Button size='small' style={darkMode ? { color: '#4aedc4' } : { color: '#3d5afe' }} onClick={() => dispatch(likePost(post._id))} >
          <ThumbUpAltIcon fontSize='small' />
          Like
          {" " + post.likeCount}
        </Button>
        <Button size='small' style={darkMode ? { color: '#4aedc4' } : { color: '#3d5afe' }} onClick={() => dispatch(deletePost(post._id))} >
          <DeleteIcon fontSize='small' />
          Delete
        </Button>
      </CardActions>
    </Card>
  );
}

export default Post;