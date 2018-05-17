package com.eventstorming.eventstorming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventstorming.eventstorming.event.OrderEvent;

public interface OrderEventStoreRepo extends JpaRepository<OrderEvent,Long>{

	
}
