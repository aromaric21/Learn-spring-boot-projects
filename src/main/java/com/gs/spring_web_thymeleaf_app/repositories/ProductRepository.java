package com.gs.spring_web_thymeleaf_app.repositories;

import com.gs.spring_web_thymeleaf_app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
