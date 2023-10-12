package com.kushal.cs545waa.model.manyToMany.biDirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SalespersonE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<CustomerE> customers = new ArrayList<>();

}
