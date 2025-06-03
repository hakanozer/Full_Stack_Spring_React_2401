import React, { useState } from 'react'
import { NavLink } from 'react-router-dom'

function Login() {

  // state - değişken
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  // arrow func
  const userLogin = (evt: React.FormEvent) => {
    evt.preventDefault()
    console.log(email, password)
  }

  return (
    <>
        <div className="row">
          <div className='col-12 col-md-3 col-lg-4'></div>
          <div className='col-12 col-md-6 col-lg-4'>
            <h2>User Login</h2>
            <form onSubmit={userLogin}>
              <div className='mb-2'>
                <input onChange={(evt) => setEmail(evt.target.value)} required type='email' placeholder='E-Mail' className='form-control' />
              </div>
              <div className='mb-2'>
                <input onChange={(evt) => setPassword(evt.target.value)} required type='password' placeholder='Password' className='form-control' />
              </div>
              <div className='d-flex justify-content-between'>
                <button className='btn btn-success'>Login</button>
                <NavLink to={'/register'} className='btn btn-dark'>Register</NavLink>
              </div>
            </form>
          </div>
          <div className='col-12 col-md-3 col-lg-4'></div>
        </div>
    </>
  )
}

export default Login
