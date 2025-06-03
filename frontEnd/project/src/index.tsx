import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

// import pages
import Login from './pages/Login';
import Register from './pages/Register';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

// main routes
const routes = 
<BrowserRouter>
  <Routes>
    <Route path='/' element={<Login/>} />
    <Route path='/register' element={<Register/>} />
  </Routes>
</BrowserRouter>

root.render(routes);