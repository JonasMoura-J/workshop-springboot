package com.jonas.course.repositories;

import com.jonas.course.entities.OrderItem;
import com.jonas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
