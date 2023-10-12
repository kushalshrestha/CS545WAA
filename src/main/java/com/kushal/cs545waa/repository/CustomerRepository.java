package com.kushal.cs545waa.repository;

import com.kushal.cs545waa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
