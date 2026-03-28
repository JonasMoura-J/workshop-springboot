package com.jonas.course.repositories;

import com.jonas.course.entities.Category;
import com.jonas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
