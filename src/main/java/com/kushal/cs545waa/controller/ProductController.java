package com.kushal.cs545waa.controller;


import com.kushal.cs545waa.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/products")
public class ProductController {


    @GetMapping
    public String getProducts(Model model) {
        Product p1 = new Product(1, "Title 1", "Description 1", 900);
        Product p2 = Product.builder()
                            .id(2)
                            .title("Title 2")
                            .description("Description 2")
                            .price(100)
                            .build();
        var products = Arrays.asList(p1, p2);
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/getProduct")
    public String getProductsById(@RequestParam(name = "productId") int id, Model model) {
        Product p = Product.builder()
                           .id(id)
                           .title("Title " + id)
                           .description("Description " + id)
                           .price(id * 10)
                           .build();
        model.addAttribute("product", p);
        return "product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int productId, Model model) {
        String message = "Product id : " + productId + " deleted successfully!!!";
        model.addAttribute("response", message);
        return "product-delete";
    }

}
