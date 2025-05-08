package com.works.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(unique = true)
    private String username;
    private String password;
    private Boolean enable;

    @ManyToMany
    private List<Role> roles;


}

