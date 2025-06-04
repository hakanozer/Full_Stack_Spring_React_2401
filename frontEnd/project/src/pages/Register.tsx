import React, { useState } from 'react'

function Register() {

  const [passShow, setPassShow] = useState(false)

  return (
    <>
      <div className='row'>
        <div className='col-12 col-md-3 col-lg-4'></div>
        <div className='col-12 col-md-6 col-lg-4'>
          <h2>User Register</h2>
          <form>
            <div className='mb-2'>
              <input placeholder='Name' className='form-control' />
            </div>
            <div className='mb-2'>
              <input type='email' placeholder='E-Mail' className='form-control' />
            </div>
            <div className='mb-2 input-group'>
              <input type={passShow == true ? 'text' : 'password'} placeholder='Password' className='form-control' />
              <a onClick={() => setPassShow(!passShow)} className='btn btn-info'><i className={passShow == true ? 'bi bi-key-fill' : 'bi bi-key'}></i></a>
            </div>
            <div className='mb-2'>
              <input type={passShow == true ? 'text' : 'password'} placeholder='Password Again' className='form-control' />
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