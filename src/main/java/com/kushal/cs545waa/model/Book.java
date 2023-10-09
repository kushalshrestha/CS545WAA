package com.kushal.cs545waa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@RequiredArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
