import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

// import pages
import Login from './pages/Login';
import Register from './pages/Register';
import Dashboard from './pages/Dashboard';
import Control from './pages/Control';
import Likes from './pages/Likes';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

// main routes
const routes = 
<BrowserRouter>
  <Routes>
    <Route path='/' element={<Login/>} />
    <Route path='/register' element={<Register/>} />
    <Route path='/dashboard' element={<Control item={ <Dashboard /> } />} />
    <Route path='/likes' element={<Control item={ <Likes /> } />} />
  </Routes>
</BrowserRouter>

root.render(routes);