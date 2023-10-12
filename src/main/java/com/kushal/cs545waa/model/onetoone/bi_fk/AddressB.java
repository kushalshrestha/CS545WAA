package com.kushal.cs545waa.model.onetoone.bi_fk;

import jakarta.persistence.*;

@Entity
public class AddressB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    @OneToOne(mappedBy = "address")
    private CustomerB customer;
}
