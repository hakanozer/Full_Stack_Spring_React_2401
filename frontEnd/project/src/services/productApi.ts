import { IProducts, ISingleProduct } from "../models/IProducts";
import { config } from "./config";

export const allProduct = (page: number) => {
    const sendObj = {
        page: page,
        per_page: 10
    }
    return config.get<IProducts>('products', {params: sendObj} )
}

export const singleProduct = (pid: string) => {
    return config.get<ISingleProduct>('products/'+pid)
}

export const searchProduct = (q: string) => {
    const sendObj = {
        query: q,
        page: 1,
        per_page: 10
    }
    return config.get<IProducts>('products/search', {params: sendObj} )
}