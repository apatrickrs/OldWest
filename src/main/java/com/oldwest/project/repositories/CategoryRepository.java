package com.oldwest.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oldwest.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
