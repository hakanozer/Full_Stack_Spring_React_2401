import React from 'react'
import { Product } from '../models/IProducts'

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
              <a href="#" className="btn btn-primary">Detail</a>
            </div>
          </div>
        </div>
      )}
    </div>
  )
}

export default ProductsList