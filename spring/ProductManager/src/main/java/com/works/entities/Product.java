package com.works.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.works.utils.EProduct;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Product {

    // @Schema(hidden = true)
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

    @Size(min = 7, max = 7)
    private String color;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date date;


}
