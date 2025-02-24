package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductRestController {

    final ProductService productService;

    @PostMapping("save")
    public Product save(@Valid @RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping("saveAll")
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }


    @GetMapping("list")
    public List<Product> list() {
        return productService.all();
    }

    @GetMapping("single")
    public Product singleProduct(
            @RequestParam(defaultValue = "1") long pid,
            @RequestParam(defaultValue = "0") int cid
    ) {
        System.out.println(cid);
        return productService.singleProduct(pid);
    }

}
