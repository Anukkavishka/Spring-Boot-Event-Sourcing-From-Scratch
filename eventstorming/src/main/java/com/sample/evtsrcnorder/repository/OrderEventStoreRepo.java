package com.sample.evtsrcnorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.evtsrcnorder.event.OrderEvent;

public interface OrderEventStoreRepo extends JpaRepository<OrderEvent,Long>{

	
}
