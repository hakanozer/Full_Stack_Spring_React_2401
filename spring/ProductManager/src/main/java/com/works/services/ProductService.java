package com.works.services;

import com.works.entities.Customer;
import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;
    final HttpServletRequest request;

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
        Object customerObj = request.getSession().getAttribute("user");
        Customer customer = (Customer) customerObj;
        System.out.println(customer);
        return pageProduct;
    }

    public Product singleProduct(long pid ) {
        Optional<Product> product = productRepository.findById(pid);
        Product pro = product.orElse(null);
        System.out.println(pro);
        Random random = new Random();
        return pro;
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


    // product search
    public Page<Product> productSearch(String q, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findByTitleContainsOrDescriptionContainsAllIgnoreCase(q,q, pageable);
    }

    public List<Product> getColors(String color) {
        color ="#"+color;
        return productRepository.findByColorEqualsIgnoreCase(color);
    }

    public ResponseEntity<Product> productUpdate(Product product) {
        if (product.getPid() == null || product.getPid() < 1) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<Product> productOptional = productRepository.findById(product.getPid());
        if (productOptional.isPresent()) {
            productRepository.saveAndFlush(product);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity deleteProduct(Long pid) {
        ResponseEntity res = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        if (pid == null || pid < 1) { } else {
            Optional<Product> productOptional = productRepository.findById(pid);
            if (productOptional.isPresent()) {
                productRepository.deleteById(pid);
                res = new ResponseEntity(HttpStatus.OK);
            }
        }
        return res;
    }

}

