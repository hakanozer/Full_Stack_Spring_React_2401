import React, { useEffect, useState } from 'react'
import { allProduct } from '../services/productApi'
import { Product } from '../models/IProducts'
import ProductsList from '../components/ProductsList'

function Dashboard() {

  const [arr, setArr] = useState<Product[]>([])
  const [pages, setPages] = useState<number[]>([])


  useEffect(() => {
    allPro(1)
  }, []) // [] sadece 1 kez çalış

  const allPro = (page: number) => {
    allProduct(page)
    .then(res => {
      const dt = res.data
      setArr(dt.data)
      var arrPages:number[] = []
      for (let i = 0; i < dt.meta.pagination.total_pages; i++) {
        arrPages.push(i+1)
      }
      setPages(arrPages)
    })
  }

  return (
    <>
    <h3>Products</h3>
    <nav>
      <ul className="pagination pagination-sm">
        { pages.map((item) => 
          <li role='button' key={item} onClick={() => allPro(item)} className="page-item"><a className="page-link">{item}</a></li>
        )}
      </ul>
    </nav>
    <ProductsList arr={arr} />
    </>
  )

}

export default Dashboard