package com.luan1221.sbwebservice.services;

import com.luan1221.sbwebservice.entities.Category;
import com.luan1221.sbwebservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optional = repository.findById(id);
        return optional.get();
    }

}
