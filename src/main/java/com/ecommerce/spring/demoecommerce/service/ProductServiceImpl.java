package com.ecommerce.spring.demoecommerce.service;

import com.ecommerce.spring.demoecommerce.entity.Product;
import com.ecommerce.spring.demoecommerce.exception.ResourceNotFoundException;
import com.ecommerce.spring.demoecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired private ProductRepository productRepository;

    @Override
    public @NotNull Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(@Min(value = 1L, message = "Invalid product ID") long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Page<Product> findAllInCategory(Integer categoryType, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }
}
