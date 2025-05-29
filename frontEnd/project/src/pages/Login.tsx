import React from 'react'

function Login() {

  // arrow func
  const userLogin = (evt: React.FormEvent) => {
    evt.preventDefault()
    console.log("userLogin call")
  }

  return (
    <>
        <div className="row">
          <div className='col-12 col-md-3 col-lg-4'></div>
          <div className='col-12 col-md-6 col-lg-4'>
            <h2>User Login</h2>
            <form onSubmit={userLogin}>
              <div className='mb-2'>
                <input required type='email' placeholder='E-Mail' className='form-control' />
              </div>
              <div className='mb-2'>
                <input required type='password' placeholder='Password' className='form-control' />
              </div>
              <div className='d-flex justify-content-between'>
                <button className='btn btn-success'>Login</button>
                <a className='btn btn-dark' href=''>Register</a>
              </div>
            </form>
          </div>
          <div className='col-12 col-md-3 col-lg-4'></div>
        </div>
    </>
  )
}

export default Login
