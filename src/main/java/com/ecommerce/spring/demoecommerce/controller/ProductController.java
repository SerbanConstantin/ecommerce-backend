package com.ecommerce.spring.demoecommerce.controller;

import com.ecommerce.spring.demoecommerce.entity.Product;
import com.ecommerce.spring.demoecommerce.service.CategoryService;
import com.ecommerce.spring.demoecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired private ProductService productService;

    @GetMapping(value = {"", "/"})
    public @NotNull Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
