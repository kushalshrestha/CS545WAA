package com.kushal.cs545waa.model.onetoone.bi_fk;

import jakarta.persistence.*;

@Entity
public class CustomerB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private AddressB address;
}
