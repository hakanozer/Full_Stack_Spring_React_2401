import React, { useEffect, useState } from 'react'
import { useSearchParams } from 'react-router-dom'
import { searchProduct } from '../services/productApi'
import { Product } from '../models/IProducts'
import ProductsList from '../components/ProductsList'

function Search() {

  const [params] = useSearchParams()
  const [arr, setArr] = useState<Product[]>([])
  const [data, setData] = useState('')
  useEffect(() => {
    const q = params.get('q')
    if (q) {
        setData(q)
        searchProduct(q).then(res => {
            const dt = res.data
            setArr(dt.data)
        }).catch(err => {

        })
    }else {
        window.location.replace('/dashboard')
    }
    
  }, [])

  return (
    <>
        <h3>Search - ({arr.length})</h3>
        { arr.length == 0 &&
            <div className="alert alert-danger" role="alert">
                {data} - Products Not Found!
            </div>
        }
        <ProductsList arr={arr} />
    </>
  )
}

export default Search
