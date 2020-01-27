package com.oldwest.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oldwest.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
