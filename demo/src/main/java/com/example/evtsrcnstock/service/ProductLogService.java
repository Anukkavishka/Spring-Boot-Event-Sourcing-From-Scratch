package com.example.evtsrcnstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evtsrcnstock.entity.ProductLog;
import com.example.evtsrcnstock.repository.ProductLogRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class ProductLogService {


    @Autowired
    public ProductLogRepository productRepository;

    public void insert(ProductLog product) {
        productRepository.save(product);
    }

    public Optional<ProductLog> find(int id) {
        return productRepository.findById(id);
    }

    public Iterable<ProductLog> findAll() {
        return productRepository.findAll();
    }

    public void updateProduct(ProductLog product) {
        productRepository.save(product);
    }

    public void deleteProduct(ProductLog product) {
        productRepository.delete(product);
    }


}
