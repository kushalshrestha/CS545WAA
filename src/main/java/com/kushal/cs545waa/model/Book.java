package com.kushal.cs545waa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Book {
    private int id;
    private String title;
    private String isbn;
}
