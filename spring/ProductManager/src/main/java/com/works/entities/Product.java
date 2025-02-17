package com.works.entities;

import com.works.utils.EProduct;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Size(min = 2, max = 200)
    @NotEmpty
    @NotNull
    private String title;

    @Size(message = "3", min = 500)
    @NotEmpty
    @NotNull
    private String description;

    @NotNull
    @Enumerated
    private EProduct status;

    @Max(5000000)
    @Min(1)
    @NotNull
    private BigDecimal price;

    @Size(min = 6, max = 6)
    private String color;

    private Date date;


}
