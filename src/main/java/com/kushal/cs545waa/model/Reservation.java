package com.kushal.cs545waa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reservationDetails;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
