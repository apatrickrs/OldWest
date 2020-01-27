package com.oldwest.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oldwest.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
