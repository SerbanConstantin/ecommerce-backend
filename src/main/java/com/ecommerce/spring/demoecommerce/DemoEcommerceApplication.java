package com.ecommerce.spring.demoecommerce;

import com.ecommerce.spring.demoecommerce.entity.Product;
import com.ecommerce.spring.demoecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEcommerceApplication.class, args);
	}
}

