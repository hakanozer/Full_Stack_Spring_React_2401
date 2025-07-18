import React, { useState } from 'react'
import { authSignUp } from '../services/userApi'

function Register() {

  const [passShow, setPassShow] = useState(false)
  const [error, setError] = useState('')
  const [success, setSuccess] = useState('')

  const [name, setName] = useState('')
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [passwordAgain, setPasswordAgain] = useState('')

  const userRegister = (evt: React.FormEvent) => {
    evt.preventDefault() // formun gönderilirken sahneyi terk etmesini engelle
    setError('')
    setSuccess('')
    if( password !== passwordAgain ) {
      setError('Password and Password Again not Equals!')
    }else {
      authSignUp(name, email, password)
      .then(res => {
        const dt = res.data
        setSuccess(dt.message)
        setTimeout(() => {
          window.location.replace('/')
        }, 3000);
      })
      .catch(err => {
        const res = err.response.data.errors
        const emailError = res.email
        const passwordError = res.password
        if (emailError) {
          setError(emailError[0])
        }
        if (passwordError) {
          setError(passwordError[0])
        }
      })
    }
    
  }

  const emailValid = (dataEmail: string) => {
    setEmail(dataEmail)
    //console.log(dataEmail)
  }

  return (
    <>
      <div className='row'>
        <div className='col-12 col-md-3 col-lg-4'></div>
        <div className='col-12 col-md-6 col-lg-4'>
          <h2>User Register</h2>

          { error !== '' &&
            <div className="alert alert-danger" role="alert">
              { error }
            </div>
          }

          { success !== '' &&
            <div className="alert alert-success" role="alert">
              { success }
            </div>
          }

          <form onSubmit={userRegister}>
            <div className='mb-2'>
              <input required onChange={(evt) => setName(evt.target.value)} placeholder='Name' className='form-control' />
            </div>
            <div className='mb-2'>
              <input required onChange={(evt) => emailValid(evt.target.value)} type='email' placeholder='E-Mail' className='form-control' />
            </div>
            <div className='mb-2 input-group'>
              <input required onChange={(evt) => setPassword(evt.target.value)}  type={passShow === true ? 'text' : 'password'} placeholder='Password' className='form-control' />
              <a onClick={() => setPassShow(!passShow)} className='btn btn-light'><i className={passShow === true ? 'bi bi-key-fill' : 'bi bi-key'}></i></a>
            </div>
            <div className='mb-2'>
              <input required onChange={(evt) => setPasswordAgain(evt.target.value)} type={passShow === true ? 'text' : 'password'} placeholder='Password Again' className='form-control' />
            </div>
            <button className='btn btn-success'>Send</button>
          </form>
        </div>
        <div className='col-12 col-md-3 col-lg-4'></div>
      </div>
    </>
  )
}

export default Register