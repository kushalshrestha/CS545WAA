package com.kushal.cs545waa;

import com.kushal.cs545waa.model.Customer;
import com.kushal.cs545waa.model.Order;
import com.kushal.cs545waa.model.OrderLine;
import com.kushal.cs545waa.model.Product;
import com.kushal.cs545waa.repository.CustomerRepository;
import com.kushal.cs545waa.repository.OrderLineRepository;
import com.kushal.cs545waa.repository.OrderRepository;
import com.kushal.cs545waa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Cs545WaaApplication {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderLineRepository orderLineRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cs545WaaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

            Product product = new Product();
            product.setName("Product A");
            product.setDescription("Description for Product A");

            Product product1 = new Product();
            product1.setName("Product B");
            product1.setDescription("Description for Product B");

            productRepository.save(product);
            productRepository.save(product1);

            OrderLine orderLine = new OrderLine();
            orderLine.setQuantity(5);
            orderLine.setProduct(product);
            orderLineRepository.save(orderLine);

            OrderLine orderLine2 = new OrderLine();
            orderLine2.setQuantity(5);
            orderLine2.setProduct(product1);
            orderLineRepository.save(orderLine2);

            OrderLine orderLine3 = new OrderLine();
            orderLine3.setQuantity(15);
            orderLine3.setProduct(product);
            orderLineRepository.save(orderLine3);


            OrderLine orderLine4 = new OrderLine();
            orderLine4.setQuantity(50);
            orderLine4.setProduct(product1);
            orderLineRepository.save(orderLine4);


            Customer customer = new Customer();
            customer.setFirstName("Kushal");
            customer.setLastName("Shrestha");
            customerRepository.save(customer);


            Order order = new Order();
            order.setDate(LocalDate.now());
            order.setCustomer(customer);
            order.setOrderLines(Arrays.asList(orderLine, orderLine2, orderLine3, orderLine4));
            orderRepository.save(order);

        };
    }

}
