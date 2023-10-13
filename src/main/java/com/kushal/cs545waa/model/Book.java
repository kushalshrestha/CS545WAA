package com.kushal.cs545waa.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("Book")
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Product{
    private String title;
}
