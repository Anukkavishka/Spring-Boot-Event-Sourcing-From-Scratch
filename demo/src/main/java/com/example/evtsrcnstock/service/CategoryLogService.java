package com.example.evtsrcnstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evtsrcnstock.entity.CategoryLog;
import com.example.evtsrcnstock.repository.CategoryLogRepository;
import com.example.evtsrcnstock.repository.CategoryRepository;

import javax.transaction.Transactional;
import java.util.Optional;
@Transactional
@Service
public class CategoryLogService {

    @Autowired
    private CategoryLogRepository categoryRepository;

    public void insert(CategoryLog category) {
        categoryRepository.save(category);
    }


    public Optional<CategoryLog> findById(int id) {
        return categoryRepository.findById(id);
    }

    public Iterable<CategoryLog> findAll() {
        return categoryRepository.findAll();
    }

    public void updateCategory(CategoryLog category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(CategoryLog category) {

        categoryRepository.delete(category);
    }


}
