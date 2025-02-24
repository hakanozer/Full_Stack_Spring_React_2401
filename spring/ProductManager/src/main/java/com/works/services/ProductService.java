package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

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

    public Product singleProduct( long pid ) {
        Optional<Product> optionalProduct = productRepository.findById(pid);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            Date date = product.getDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss", new Locale("tr", "TR") );
            String dateStr = simpleDateFormat.format( date );
            System.out.println( dateStr );
            product.setDate( date );
        }
        return optionalProduct.orElse(null);
    }

}
