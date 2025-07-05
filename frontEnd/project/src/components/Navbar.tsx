import React, { useEffect, useRef, useState } from 'react'
import { NavLink } from 'react-router-dom'
import { jwtLogout } from '../services/userApi';
import { allLikes } from '../utils/storeLikes';
import { useDispatch, useSelector } from 'react-redux';
import { StateType } from '../useRedux/reduxStore';
import { ILikesAction } from '../useRedux/likesReducer';

function Navbar(props: {name: string}) {

    const inputRef = useRef<HTMLInputElement>(null)

   // redux ile data çekme
   const allLike = useSelector((item: StateType) => item.likesReducer )
   // redux'a data yazma
   const dispath = useDispatch()
   useEffect(() => {
    const arrLike = allLikes()
    const sendObj:ILikesAction = {
        type: 'ALL_LIKES',
        payload: arrLike
    }
    dispath(sendObj)
   }, []) 

   useEffect(() => {
    if (inputRef.current) {
        //inputRef.current.focus();
        //inputRef.current.style.backgroundColor = '#ffffff';
    }
   }, [])

  const logout = () => {
    const answer = window.confirm("Are you sure?");
    if (answer) {
        const jwt = localStorage.getItem('token') ?? ''
            jwtLogout(jwt).then(res => {
                console.log(res.data)
            }).catch(err => {
                console.log(err.message)
            }).finally(() => {
                localStorage.removeItem('token')
                window.location.replace('/')
            })
    }
  }  

  return (
    <nav className="navbar navbar-expand-lg bg-body-tertiary">
        <div className="container-fluid">
            <a className="navbar-brand" href="#">App Title</a>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                <li className="nav-item">
                <NavLink to='/dashboard' className="nav-link" >Dashboard</NavLink>
                </li>
                <li className="nav-item">
                <NavLink to='/likes' className="nav-link" >Likes</NavLink>
                </li>
                <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Profile
                </a>
                <ul className="dropdown-menu">
                    <li><a className="dropdown-item" href="#">Action</a></li>
                    <li><a className="dropdown-item" href="#">Another action</a></li>
                    <li><hr className="dropdown-divider" /></li>
                    <li><button onClick={logout} className="dropdown-item">Logout</button></li>
                </ul>
                </li>
                <li className="nav-item">
                <a className="nav-link disabled" aria-disabled="true">Sn. {props.name} - ({allLike.length})</a>
                </li>
            </ul>
            <form action='/search' className="d-flex" role="search">
                <input name='q' ref={inputRef} className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                <button className="btn btn-outline-success" type="submit">Search</button>
            </form>
            </div>
        </div>
    </nav>
  )
}

export default Navbar