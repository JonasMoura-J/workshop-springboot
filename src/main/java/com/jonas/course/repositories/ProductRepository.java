package com.jonas.course.repositories;

import com.jonas.course.entities.Category;
import com.jonas.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
