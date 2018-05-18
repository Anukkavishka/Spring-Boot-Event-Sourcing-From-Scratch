package com.example.evtsrcnstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evtsrcnstock.entity.StockLog;

public interface StockLogRepository  extends JpaRepository<StockLog,Integer> {
}
