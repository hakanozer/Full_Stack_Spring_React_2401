import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import { singleProduct } from '../services/productApi'
import { Product } from '../models/IProducts'
import { likeControl } from '../utils/storeLikes'

function Detail() {

   const {pid} = useParams()
   const [item, setItem] = useState<Product>()
   const [bigImage, setBigImage] = useState('')
   useEffect(() => {
    if (pid) {
        singleProduct(pid).then(res => {
            const dt = res.data
            setItem(dt.data)
            setBigImage(dt.data.images[0])
        }).catch(err => {
            window.location.replace('/dashboard')
        })
    }
   }, [])

   const [isLike, setIsLike] = useState(false)
   const likesBtn = (pid:number) => {
    setIsLike(!isLike)
    likeControl(pid)
   }
   

  return (
    <>
    {item &&
        <>
            <div className='row'>
                <div className='col-sm-6'>
                    <h3>{item.title}</h3>
                    <h4 className='text-danger'>{item.price}₺</h4>
                    <p>{item.category}</p>
                    <p>{item.description}</p>
                    <p>{item.brand}</p>
                    <i onClick={() => likesBtn(item.id)} role='button' className={'fs-3 bi bi-suit-heart' + (isLike === true ? '-fill text-danger' : '') }></i>
                </div>
                <div className='col-sm-6'>
                    <img className='img-fluid' src={bigImage} />
                    
                    { item.images.map((img, index) => 
                        <img role='button' onClick={() => setBigImage(img)} src={img} className='img-thumbnail m-1' width={120} />
                    )}
                </div>
            </div>
        </>
    }
    </>
  )
}

export default Detail