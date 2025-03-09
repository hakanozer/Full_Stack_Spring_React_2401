package com.works.repositories;

import com.works.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

    // JPQL
    Page<Product> findByTitleContainsOrDescriptionContainsAllIgnoreCase(String title, String description, Pageable pageable);

    List<Product> findByColorEqualsIgnoreCase(String color);

}

