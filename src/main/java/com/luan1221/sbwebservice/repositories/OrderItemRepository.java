package com.luan1221.sbwebservice.repositories;

import com.luan1221.sbwebservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
