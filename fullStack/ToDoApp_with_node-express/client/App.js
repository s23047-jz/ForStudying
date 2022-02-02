import { useState, useEffect } from 'react'

const SERVER_BASE = "http://localhost:3001";

function App() {

  const [tasks, setTasks] = useState([]);
  const [taskActive, setTaskActive] = useState(false);
  const [newTask, setNewTask] = useState('');

  useEffect(() => {
    GetTasks();
  }, []);

  const GetTasks = () => {
    fetch(SERVER_BASE + "/tasks")
      .then(res => res.json())
      .then(data => setTasks(data))
      .catch(err => console.log("Error: ", err));
  };

  const completeTask = async id => {
    const data = await fetch(SERVER_BASE + "/task/complete/" + id)
      .then(res => res.json())

    setTasks(tasks => tasks.map(task => {
      if (task._id === data._id) {
        task.complete = data.complete;
      }
      return task;
    }));
  };

  const deleteTask = async id => {
    const data = await fetch(SERVER_BASE + "/task/delete/" + id, { method: "DELETE" })
      .then(res => res.json());

    setTasks(tasks => tasks.filter(task => task._id !== data._id));
  }

  const addTask = async () => {
    const data = await fetch(SERVER_BASE + "/task/new", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({
        text: newTask,
      })
    }).then(res => res.json());
    setTasks([...tasks, data]);
    setTaskActive(false);
    setNewTask("");
  }

  return (
    <div className="App">
      <h1>Welcome to Todo App</h1>
      <h3>Your tasks</h3>
      <div className="tasks">
        {tasks.map(task => (
          <div className={"tasks__todo" + (task.complete ? " tasks__completed" : "")} key={task._id} onClick={() => completeTask(task._id)}>
            <div className="tasks__checkbox"></div>
            <div className="tasks__text">{task.text}</div>
            <div className="delete__tasks" onClick={() => deleteTask(task._id)}>X</div>
          </div>
        ))}
      </div>
      <div className='addTaskBtn' onClick={() => setTaskActive(true)}>+</div>
      {taskActive ? (
        <div className='addTask'>
          <div className='addTask__closeAddTask' onClick={() => setTaskActive(false)}>X</div>
          <div className="addTask__content">
            <h3>Add Task</h3>
            <input type="text" className='addTask__input' onChange={event => setNewTask(event.target.value)} value={newTask} />
            <div className="addTask__button" onClick={addTask}>Add Task</div>
          </div>
        </div>) : ""}
    </div>
  );
}

export default App;
