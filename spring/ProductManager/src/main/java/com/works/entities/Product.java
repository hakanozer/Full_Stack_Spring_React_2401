package com.works.entities;

import com.works.utils.EProduct;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    @Size(min = 3, max = 500)
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

    // 19-02-2025 20:52:22
    @DateTimeFormat(pattern = "YYYY")
    private Date date;


}
