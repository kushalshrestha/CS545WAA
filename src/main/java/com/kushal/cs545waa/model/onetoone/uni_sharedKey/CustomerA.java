package com.kushal.cs545waa.model.onetoone.uni_sharedKey;

import com.kushal.cs545waa.model.onetoone.uni_FK.Address;
import jakarta.persistence.*;

@Entity
public class CustomerA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;
}
