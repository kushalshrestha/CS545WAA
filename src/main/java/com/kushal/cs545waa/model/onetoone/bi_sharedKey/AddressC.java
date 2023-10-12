package com.kushal.cs545waa.model.onetoone.bi_sharedKey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class AddressC {

    @Id
    private Long id;

    private String city;

    @OneToOne
    @PrimaryKeyJoinColumn
    private CustomerC customer;
}
