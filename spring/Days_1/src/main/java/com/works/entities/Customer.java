package com.works.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity // Customer bir veritabanı tablosudur.
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Length(min = 2, max = 20)
    @NotNull // nesne varlığını - null check
    @NotEmpty // data varlığını - equals("") check
    private String name;

    @Size(min = 2, max = 20)
    @NotEmpty
    @NotNull
    private String surname;

    @Column(unique = true)
    @Email
    @Size(min = 6, max = 50)
    @NotEmpty
    @NotNull
    private String email;


    // 8 char
    // )(/&%+^
    // A-Z
    // a-z
    // 1-9
    @Size(min = 8, max = 16)
    @NotEmpty
    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}$")
    private String password;

    @Max(50)
    @Min(18)
    private Integer age;

}


