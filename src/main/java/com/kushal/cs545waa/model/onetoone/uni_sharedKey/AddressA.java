package com.kushal.cs545waa.model.onetoone.uni_sharedKey;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddressA {

    @Id
    private Long id;

    private String city;

}
