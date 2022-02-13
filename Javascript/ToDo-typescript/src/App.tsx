import React, { FC, useState, ChangeEvent } from 'react';

import './App.css';
import TaskList from './components/TaskList';
import Header from './layouts/Header';
import { ITask } from './Interface';

const App: FC = () => {

  const [task, setTask] = useState<string>("");
  const [deadline, setDeadline] = useState<number>(0);
  const [tasksList, setTasksList] = useState<ITask[]>([]);

  let id = tasksList.length + 1;
  console.log(id);


  //Niczego nie zwracamy, temu void
  const handleChange = (event: ChangeEvent<HTMLInputElement>): void => {
    if (event.target.name === 'task') {
      setTask(event.target.value);
    } else {
      setDeadline(Number(event.target.value));
    }
  };

  const addTask = (): void => {
    const newTask = { id: id, taskName: task, deadLine: deadline, };
    setTasksList([...tasksList, newTask]);
    setTask('');
    setDeadline(0);
  }

  const removeTask = (id: number): void => {
    setTasksList(tasksList.filter(task => task.id !== id));
  }

  return (
    <div className='App'>
      <div className='header'>
        <Header change={handleChange} addTask={addTask} />
      </div>
      <div className='taskList'>
        <TaskList tasksList={[...tasksList]} removeTask={removeTask} />
      </div>
    </div>
  );
}

export default App;