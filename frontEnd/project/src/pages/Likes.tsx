import React, { useEffect, useState } from 'react'
import { allLikes } from '../utils/storeLikes'
import { singleProduct } from '../services/productApi';
import { Product } from '../models/IProducts';
import axios from 'axios';
import ProductsList from '../components/ProductsList';

function Likes() {

  const [arr, setArr] = useState<Product[]>([])

  useEffect(() => {
    const arrLike = allLikes()
    const newArr:Product[] = []
    axios.all(arrLike.map((item) => singleProduct(""+item) )).then(ress => {
      ress.map((res) => {
        newArr.push(res.data.data)
      })
      setArr(newArr)
    })
  }, [])

  return (
    <>
      <h3>Likes</h3>
      <ProductsList arr={arr} />
    </>
  )
}

export default Likes