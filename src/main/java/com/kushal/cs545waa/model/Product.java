package com.kushal.cs545waa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
}
