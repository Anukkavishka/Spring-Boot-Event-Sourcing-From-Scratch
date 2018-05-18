package com.example.evtsrcnstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evtsrcnstock.entity.ProductLog;

public interface ProductLogRepository  extends JpaRepository<ProductLog,Integer> {
}
