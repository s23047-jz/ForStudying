import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import './../../styles/pages/LoginPage.scss'

const LoginPage = () => {

  const [wantToLogin, setWantToLogin] = useState(true);

  const [userName, setUserName] = useState('')
  const [userPassword, setUserPassword] = useState('')
  const [userEmail, setUserEmail] = useState('')
  const [user, setUser] = useState([]);

  const handleChangeUserName = event => setUserName(event.target.value);
  const handleChangeUserPassword = event => setUserPassword(event.target.value);
  const handleChangeUserEmail = event => setUserEmail(event.target.value);

  const handleToRegisterUser = event => {
    event.preventDefault();
    const user = {
      userName,
      userPassword,
      userEmail,
    }
    fetch("http://localhost:8080/user/createUser", {
      method: "post",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(user)
    }).then(() => {
      console.log("User has been registered");
    })
  }

  // const handleToLoginUser = event => {
  //   event.preventDefault();
  //
  // }
  //Learn about java security and finish login someday

  useEffect(() => {
    fetch("http://localhost:8080/user/getAllUsers")
      .then(response => response.json())
      .then(data => setUser(data))
      .catch(error => console.log(Error, error))
  }, []);

  const users = user.map(user => <div key={user.id} style={{ width: "80%" }}>
    <p>
      userID: {user.id},<br />
      UserName: {user.userName},<br />
      UserPassword: {user.userPassword},<br />
      UserEmail: {user.userEmail},<br />
    </p>
  </div>)

  const handleWantToLogin = () => setWantToLogin(!wantToLogin)
  if (wantToLogin) {
    return (
      <div className='loginPage'>
        <div className='loginArea'>
          <div className='loginBoard'>
            <label>
              <input type="text" name='userName' placeholder='username' value={userName} onChange={handleChangeUserName} />
            </label>
            <label>
              <input type="password" name='userPassword' placeholder='password' value={userPassword} onChange={handleChangeUserPassword} />
            </label>
            <br />
            <Link onClick={handleWantToLogin}>Do not have account? Sign up</Link>
            <button type="submit">Sign in</button>
          </div>
        </div>
      </div>
    );
  } else {
    return (
      <div className='loginPage'>
        <div className='loginArea'>
          <div className='loginBoard'>
            <label>
              <input type="text" name='userName' placeholder='username' value={userName} onChange={handleChangeUserName} />
            </label>
            <label>
              <input type="password" name='userPassword' placeholder='password' value={userPassword} onChange={handleChangeUserPassword} />
            </label>
            <label>
              <input type="email" name='userEmail' placeholder='email' value={userEmail} onChange={handleChangeUserEmail} />
            </label>
            <br />
            <Link onClick={handleWantToLogin}>Already have account? Sign in</Link>
            <button type='submit' onClick={handleToRegisterUser}>Sign up</button>
            {/* <div value="Just for test for GET fetch">{users}</div> */}
          </div>
        </div>
      </div>
    );
  }
}
export default LoginPage;