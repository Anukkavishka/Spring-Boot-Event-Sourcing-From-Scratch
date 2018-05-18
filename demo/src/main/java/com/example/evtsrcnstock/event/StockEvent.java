package com.example.evtsrcnstock.event;

import com.example.evtsrcnstock.entity.Stock;

public class StockEvent {
	
	private Stock stock;
	public StockEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockEvent(Stock stock, StockEvent status) {
		super();
		this.stock = stock;
		this.status = status;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public StockEvent getStatus() {
		return status;
	}
	public void setStatus(StockEvent status) {
		this.status = status;
	}
	private StockEvent status;

}
