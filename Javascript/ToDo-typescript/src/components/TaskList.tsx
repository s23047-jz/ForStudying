import React from 'react';
import { ITask } from '../Interface';

import Task from './Task';

import './TaskList.css';

interface Props {
  tasksList: ITask[];
  removeTask: (id: number) => void;
}

const TaskList = ({ tasksList, removeTask }: Props) => {
  return (
    <div className='TaskList'>
      {tasksList.map(task => <Task key={task.id} id={task.id} name={task.taskName} deadline={task.deadLine} removeTask={removeTask} />)}
    </div>
  );
};

export default TaskList;