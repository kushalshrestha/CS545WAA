package com.kushal.cs545waa.repository;

import com.kushal.cs545waa.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

}
