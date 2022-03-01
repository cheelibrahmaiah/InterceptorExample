package com.intercenter.demo.InterceptorExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/")
    public List<String> getProducts() {
        return Arrays.asList("Sony TV", "Whirlpool Refrigerator", "Washing machine");
    }
}
