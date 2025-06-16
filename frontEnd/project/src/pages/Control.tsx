import React, { JSX, useEffect } from 'react'
import { Navigate, useLocation } from 'react-router-dom'
import { jwtControl } from '../services/userApi'
import Navbar from '../components/Navbar'

function Control( props: {item: JSX.Element} ) {

  const location = useLocation()
  const token = localStorage.getItem('token')
  // token service control
  useEffect(() => {
    const tokenNew = localStorage.getItem('token')
    if (tokenNew) {
      jwtControl(tokenNew)
        .then(res => {
            
        })
        .catch(err => {
            localStorage.removeItem('token')
            window.location.replace('/')
        })
    }
  }, [location])

  return (
    <>
    { token 
    ?
    <>
        <Navbar />
        {props.item}
    </>
    : 
    <Navigate to={'/'} />
    }
    </>
  )
}

export default Control