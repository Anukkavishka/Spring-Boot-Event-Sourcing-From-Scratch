package com.example.evtsrcnstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evtsrcnstock.entity.StockLog;
import com.example.evtsrcnstock.repository.StockLogRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class StockLogService {


    @Autowired
    private StockLogRepository stockRepository;

    public void insert(StockLog stock) {
        stockRepository.save(stock);
    }

    public Optional<StockLog> findById(int id) {
        return stockRepository.findById(id);
    }

    public Iterable<StockLog> findAll() {
        return stockRepository.findAll();
    }

    public void updateStock(StockLog stock) {
        stockRepository.save(stock);
    }

    public void deleteStock(StockLog stock) {
        stockRepository.delete(stock);
    }

}
