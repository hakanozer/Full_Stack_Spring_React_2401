package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

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

    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity save( Product product ) {
        Date date = new Date();
        product.setDate( date );
        productRepository.save(product); // setID ?
        if (product != null) {
            return new ResponseEntity(product, HttpStatus.OK); // 200
        }else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST); // 400
        }
    }

    public List<Product> saveAll( List<Product> products ) {
        return productRepository.saveAll(products);
    }

    // sayfalama
    // kaçıncı sayfa
    // her sayfada kaç item
    public Page<Product> all( int page, int size ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> pageProduct = productRepository.findAll(pageable);
        return pageProduct;
    }

    public Product singleProduct(long pid ) {
        Optional<Product> product = productRepository.findById(pid);
        return product.orElse(null);
    }

    /*
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
     */

}
