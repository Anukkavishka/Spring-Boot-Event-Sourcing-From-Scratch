package com.sample.evtsrcnorder.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.evtsrcnorder.model.Orders;
import com.sample.evtsrcnorder.repository.OrderRepo;

@Transactional
@Service
public class OrderService {

@Autowired
private OrderRepo orderRepo;

public Orders insertOrder(Orders order){
	
	orderRepo.save(order);
	
	return order;
	
	
}

public List<Orders> getAll(){
	
	return orderRepo.findAll();
}

public Orders getOrder(long id){
	
	return orderRepo.getOne(id);
}


	
}
