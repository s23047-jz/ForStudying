const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors'); //crossorgin, enable to connect client send data to server.

const app = express();

app.use(express.json());
app.use(cors());

mongoose.connect("mongodb://127.0.0.1:27017/app-todo", {
  useNewUrlParser: true,
  useUnifiedTopology: true,
})
  .then(() => console.log("Connected to db"))
  .catch(console.error);

const Task = require('./models/Task');

//sciezka do pobrania danych
app.get('/tasks', async (req, res) => {
  const tasks = await Task.find(); // szukamy naszych zadan
  res.json(tasks);
});

//sciezka do dodania nowego zadania
app.post('/task/new', (req, res) => {
  const task = new Task({
    text: req.body.text,
  });

  task.save();
  res.json(task);
});

app.delete('/task/delete/:id', async (req, res) => {
  const result = await Task.findByIdAndDelete(req.params.id);
  res.json(result);
});

app.get('/task/complete/:id', async (request, response) => {
  const task = await Task.findById(request.params.id);
  task.complete = !task.complete;
  task.save();

  response.json(task);
});

app.listen(3001, () => console.log("Server started on port 3001"));