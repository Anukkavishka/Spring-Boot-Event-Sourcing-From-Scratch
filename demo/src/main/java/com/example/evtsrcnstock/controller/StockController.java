package com.example.evtsrcnstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.evtsrcnstock.entity.Stock;
import com.example.evtsrcnstock.entity.TheLogConverter;
import com.example.evtsrcnstock.service.StockLogService;
import com.example.evtsrcnstock.service.StockService;

import java.util.Optional;
@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;
    @Autowired
    private StockLogService stockLogService;

    @RequestMapping("")
    public Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Stock> searchStock(@PathVariable int id) {
        return stockService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addStock(@RequestBody Stock stock) {
        stockService.insert(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteStock(@RequestBody Stock stock) {
        stockService.deleteStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

}
