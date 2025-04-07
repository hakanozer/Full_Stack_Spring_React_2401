package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
@Validated
@Tag(name = "Product Rest Controller", description = "Product Manager")
@SecurityRequirement(name = "session")
public class ProductRestController {

    final ProductService productService;

    @Operation(summary = "Add Product Save")
    @PostMapping("save")
    public ResponseEntity save(@Valid @RequestBody Product product) {
        return productService.save(product);
    }

    @PostMapping("saveAll")
    public List<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }


    @GetMapping("list")
    public Page<Product> list(
            @RequestParam(defaultValue = "0") int page,
            @Min(5) @Max(20) @RequestParam int size
    ) {
        return productService.all(page, size);
    }

    @GetMapping("single")
    public Product singleProduct(
            @RequestParam(defaultValue = "1") long pid,
            @RequestParam(defaultValue = "0") int cid
    ) {
        System.out.println(cid);
        return productService.singleProduct(pid);
    }

    @GetMapping("search")
    public Page<Product> search(
            @RequestParam(defaultValue = "") String q,
            @RequestParam(defaultValue = "0") int page,
            @Min(5) @Max(20) @RequestParam(defaultValue = "10") int size
    ) {
        return productService.productSearch(q, page, size);
    }

    @GetMapping("getColor/{color}")
    public List<Product> getColor( @PathVariable String color ) {
        return productService.getColors(color);
    }

    @PutMapping("update")
    public ResponseEntity<Product> update(@Valid @RequestBody Product product) {
        return productService.productUpdate(product);
    }

    @DeleteMapping("delete/{pid}")
    public ResponseEntity delete( @PathVariable Long pid) {
        return productService.deleteProduct(pid);
    }

}
