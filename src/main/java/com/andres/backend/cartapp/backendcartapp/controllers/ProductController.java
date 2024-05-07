package com.andres.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andres.backend.cartapp.backendcartapp.models.entities.Product;
import com.andres.backend.cartapp.backendcartapp.services.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping ("/products")
    public List<Product> List() {
        return service.findAll();
    }

    @GetMapping("/sasa")
    String home2() {
        return "Hello World! cata";
    }
}
