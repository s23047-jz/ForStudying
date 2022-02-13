import mongoose from "mongoose";

import postMessage from "../models/post.js";

export const getPosts = async (req, res) => {
  try {
    const postMessages = await postMessage.find();
    res.status(200).json(postMessages); //ok
  } catch (error) {
    res.status(404).json({ message: error }); //not found
  }
};
//zamiast uzywac error.message lepiej uzyc error poniewaz dostaniemy (w razie bledu) pelen komunikat co jest nie tak i gdzie.
export const createPost = async (req, res) => {
  const post = req.body;
  const newPost = new postMessage(post);
  try {
    await newPost.save();
    res.status(201).json(newPost); //201 created
  } catch (error) {
    res.status(409).json({ message: error }); //409 conflicts
  }
}

export const updatePost = async (req, res) => {
  const { id: _id } = req.params;
  const post = req.body;

  if (!mongoose.Types.ObjectId.isValid(_id)) return res.status(404).send(`No post with id: ${id}`);
  const updatedPost = await postMessage.findByIdAndUpdate(_id, { ...post, _id }, { new: true });
  res.json(updatedPost);
}

export const deletePost = async (req, res) => {
  const { id } = req.params;
  if (!mongoose.Types.ObjectId.isValid(id)) return res.status(404).send(`No post with id: ${id}`);

  await postMessage.findByIdAndDelete(id);
  res.json({ message: 'Post deleted succesfully' });
}

export const likePost = async (req, res) => {
  const { id } = req.params;
  if (!mongoose.Types.ObjectId.isValid(id)) return res.status(404).send(`No post with id: ${id}`);

  const post = await postMessage.findById(id);
  const updatedPost = await postMessage.findByIdAndUpdate(id, { likeCount: post.likeCount + 1 }, { new: true });

  res.json(updatedPost);
}