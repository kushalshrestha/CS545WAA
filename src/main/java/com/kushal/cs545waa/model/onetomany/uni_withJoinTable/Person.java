package com.kushal.cs545waa.model.onetomany.uni_withJoinTable;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(
            name="person_car",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="car_id")
    )
    private List<Car> carList = new ArrayList<>();

}
