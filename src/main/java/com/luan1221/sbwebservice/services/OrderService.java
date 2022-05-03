package com.luan1221.sbwebservice.services;

import com.luan1221.sbwebservice.entities.Order;
import com.luan1221.sbwebservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> optional = repository.findById(id);
        return optional.get();
    }

}
