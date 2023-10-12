package com.kushal.cs545waa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "tbl_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderid")
    private Long id;

    @Temporal(TemporalType.DATE)
    private LocalDate date;

    @ManyToOne
    private Customer customer;

    @OneToMany
    @JoinTable(name="order_orderLine",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "orderLine_id")
    )
    private List<OrderLine> orderLines;


}
