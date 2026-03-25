package com.jonas.course.repositories;

import com.jonas.course.entities.Order;
import com.jonas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
