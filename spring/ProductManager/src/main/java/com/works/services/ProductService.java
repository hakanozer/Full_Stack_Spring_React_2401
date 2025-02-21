package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Product save( Product product ) {
        Date date = new Date();
        product.setDate( date );
        productRepository.save(product); // setID ?
        return product;
    }

    public List<Product> saveAll( List<Product> products ) {
        return productRepository.saveAll(products);
    }

    public List<Product> all() {
        List<Product> ls = productRepository.findAll();
        return ls; // select * from product
    }

}
