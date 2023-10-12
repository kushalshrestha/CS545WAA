package com.kushal.cs545waa.repository;

import com.kushal.cs545waa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
