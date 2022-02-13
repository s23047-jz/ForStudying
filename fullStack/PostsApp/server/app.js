import express from 'express';
import bodyParser from 'body-parser'; //Przetwarzanie danych za posrednictwem HTTP zanim dotra do bazy danych.
import mongoose from 'mongoose';
import cors from 'cors';

import dotenv from 'dotenv';
import postRoutes from './routes/posts.js'; //w przeciwienstwie do reacta trzeba pamietac o napisaniu nazwy pliku z formatem.

const app = express();
dotenv.config();

app.use(bodyParser.json({ limit: '30mb', extended: true }));
app.use(bodyParser.urlencoded({ limit: '30mb', extended: true }));
app.use(cors()); //cors pozwala na lacznosc miedzy aplikacjami na rozych portach.

app.use('/posts', postRoutes);

const CONNECTION_URL = process.env.CONNECTION_URL;
const PORT = process.env.PORT;

mongoose.connect(CONNECTION_URL, { useNewUrlParser: true, useUnifiedTopology: true }) //ustawiamy aby uniknal bledow
  .then(() => app.listen(PORT, () => console.log(`Server running on port: ${PORT}`)))
  .catch(error => console.log(error.message));
