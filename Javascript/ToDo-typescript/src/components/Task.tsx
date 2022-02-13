import React from 'react';

import './Task.css';

interface Props {
  id: number,
  name: string,
  deadline: number,
  key: number,
  removeTask: (id: number) => void,
}

const Task = ({ key, id, name, deadline, removeTask }: Props) => {
  return (
    <div className='Task'>
      <span>{id}</span>
      <h1>{name}</h1>
      <h4>Days to do: <span>{deadline}</span></h4>
      <button onClick={() => removeTask(id)}>Delete Task</button>
    </div>
  );
}

export default Task;