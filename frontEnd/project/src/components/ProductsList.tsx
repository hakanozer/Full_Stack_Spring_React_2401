import React from 'react'
import { Product } from '../models/IProducts'
import { NavLink } from 'react-router-dom'

function ProductsList(props: {arr: Product[]}) {
  return (
    <div className='row'>
      { props.arr.map((item, index) =>
        <div key={index} className='col-sm-4'>
          <div className="card">
            <img src={item.images[0]} className="card-img-top" alt="..." />
            <div className="card-body">
              <h5 className="card-title">{item.price}₺</h5>
              <p className="card-text">{item.title}</p>
              <NavLink to={'/detail/'+item.id} className="btn btn-primary">Detail</NavLink>
            </div>
          </div>
        </div>
      )}
    </div>
  )
}

export default ProductsList