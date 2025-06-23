import { IProducts } from "../models/IProducts";
import { config } from "./config";

export const allProduct = (page: number) => {
    const sendObj = {
        page: page,
        per_page: 10
    }
    return config.get<IProducts>('products', {params: sendObj} )
} 