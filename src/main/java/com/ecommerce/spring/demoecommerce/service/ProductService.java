package com.ecommerce.spring.demoecommerce.service;

import com.ecommerce.spring.demoecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID") long id);

    Product save(Product product);
    Page<Product> findAllInCategory(Integer categoryType, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
}
