package com.sample.evtsrcnorder.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.evtsrcnorder.event.OrderEvent;
import com.sample.evtsrcnorder.repository.OrderEventStoreRepo;

@Transactional
@Service
public class OrderEventService {
	
	@Autowired
	private OrderEventStoreRepo orderEventRepo;
	public OrderEvent insertOrderEvent(OrderEvent orderEvent){
		
		orderEventRepo.save(orderEvent);
		
		return orderEvent;
		
		
	}

	public List<OrderEvent> getAll(){
		
		return orderEventRepo.findAll();
	}
		

}
