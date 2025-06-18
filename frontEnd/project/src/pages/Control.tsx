import React, { JSX, useEffect, useState } from 'react'
import { Navigate, useLocation } from 'react-router-dom'
import { jwtControl } from '../services/userApi'
import Navbar from '../components/Navbar'

function Control( props: {item: JSX.Element} ) {

  const [name, setName] = useState('')
  const location = useLocation()
  const token = localStorage.getItem('token')
  // token service control
  useEffect(() => {
    const tokenNew = localStorage.getItem('token')
    if (tokenNew) {
      jwtControl(tokenNew)
        .then(res => {
            const dt = res.data
            //console.log(dt.data.name)
            setName(dt.data.name)
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
        <Navbar name={name} />
        {props.item}
    </>
    : 
    <Navigate to={'/'} />
    }
    </>
  )
}

export default Control