package com.example.evtsrcnstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evtsrcnstock.entity.CategoryLog;

public interface CategoryLogRepository extends JpaRepository<CategoryLog,Integer> {
}
