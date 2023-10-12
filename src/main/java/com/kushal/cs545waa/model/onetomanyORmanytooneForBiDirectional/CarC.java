package com.kushal.cs545waa.model.onetomanyORmanytooneForBiDirectional;

import jakarta.persistence.*;

@Entity
public class CarC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @ManyToOne
    private PersonC person;
}
