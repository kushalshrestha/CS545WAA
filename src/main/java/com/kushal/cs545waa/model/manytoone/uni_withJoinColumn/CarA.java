package com.kushal.cs545waa.model.manytoone.uni_withJoinColumn;

import jakarta.persistence.*;

@Entity
public class CarA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonA person;
}
