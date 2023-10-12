package com.kushal.cs545waa.model.onetomanyORmanytooneForBiDirectional;

import com.kushal.cs545waa.model.onetomany.uni_withJoinTable.Car;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PersonC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "person")
    private List<CarC> cars = new ArrayList<CarC>();
}
