import React, { ChangeEvent } from 'react'

import "./Header.css"

interface Props {
  change: (event: ChangeEvent<HTMLInputElement>) => void,
  addTask: () => void,
}

const Header = ({ change, addTask }: Props) => {
  return (
    <div className="inputContainer">
      <input type='text' placeholder='Task' name='task' onChange={change} />
      <input type='number' placeholder='Deadline (in days)' name='deadline' onChange={change} />
      <button onClick={addTask}>Add Task</button>
    </div>
  );
}

export default Header;