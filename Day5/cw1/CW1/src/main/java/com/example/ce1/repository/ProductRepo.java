package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce1.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    
}