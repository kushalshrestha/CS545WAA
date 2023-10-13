package com.kushal.cs545waa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("CD")
@NoArgsConstructor
@AllArgsConstructor
public class CD extends Product {
    private String artist;

}
