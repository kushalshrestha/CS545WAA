package com.kushal.cs545waa.model.onetoone.bi_sharedKey;

import jakarta.persistence.*;

@Entity
public class CustomerC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @PrimaryKeyJoinColumn
    private AddressC address;
}
