package com.kushal.cs545waa.repository;

import com.kushal.cs545waa.model.Customer;
import com.kushal.cs545waa.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
