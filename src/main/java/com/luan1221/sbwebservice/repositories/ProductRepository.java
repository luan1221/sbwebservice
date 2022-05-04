package com.luan1221.sbwebservice.repositories;

import com.luan1221.sbwebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
