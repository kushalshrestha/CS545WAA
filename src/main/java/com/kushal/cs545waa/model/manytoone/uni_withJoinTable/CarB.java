package com.kushal.cs545waa.model.manytoone.uni_withJoinTable;

import jakarta.persistence.*;

@Entity
public class CarB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @ManyToOne
    @JoinTable(name="car_person",
                joinColumns = @JoinColumn(name="car_id"),
                inverseJoinColumns = @JoinColumn(name="person_id")
    )
    private PersonB person;
}
