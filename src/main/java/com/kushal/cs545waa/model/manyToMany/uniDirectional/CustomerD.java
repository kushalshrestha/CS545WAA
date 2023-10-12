package com.kushal.cs545waa.model.manyToMany.uniDirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CustomerD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name="customer_salesperson",
            joinColumns = @JoinColumn(name="customer_id"),
            inverseJoinColumns = @JoinColumn(name="salesperson_id")
                )
    private List<SalespersonD> salespersonDs = new ArrayList<>();
}
