package com.luan1221.sbwebservice.repositories;

import com.luan1221.sbwebservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
