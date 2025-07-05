import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

// import pages
import Control from './pages/Control';
import Login from './pages/Login';
import Register from './pages/Register';
import Dashboard from './pages/Dashboard';
import Likes from './pages/Likes';
import Detail from './pages/Detail';
import { Provider } from 'react-redux';
import { reduxStore } from './useRedux/reduxStore';
import Search from './pages/Search';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

// main routes
const routes = 
<Provider store={reduxStore}>
  <BrowserRouter>
    <Routes>
      <Route path='/' element={<Login/>} />
      <Route path='/register' element={<Register/>} />
      <Route path='/dashboard' element={<Control item={ <Dashboard /> } />} />
      <Route path='/likes' element={<Control item={ <Likes /> } />} />
      <Route path='/detail/:pid' element={<Control item={ <Detail /> } />} />
      <Route path='/search' element={<Control item={ <Search /> } />} />
    </Routes>
  </BrowserRouter>
</Provider>

root.render(routes);