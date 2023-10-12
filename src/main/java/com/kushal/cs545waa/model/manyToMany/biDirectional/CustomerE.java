package com.kushal.cs545waa.model.manyToMany.biDirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CustomerE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy="customers")
    private List<SalespersonE> salespersonES = new ArrayList<>();

}
