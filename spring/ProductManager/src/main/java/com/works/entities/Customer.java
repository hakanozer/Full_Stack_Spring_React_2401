package com.works.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(length = 100)
    private String name;

    @Column(unique = true, length = 250)
    private String email;

    @Column(length = 1000)
    private String password;

}


