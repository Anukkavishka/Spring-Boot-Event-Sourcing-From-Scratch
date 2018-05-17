package com.eventstorming.eventstorming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventstorming.eventstorming.model.Orders;

public interface OrderRepo extends JpaRepository<Orders,Long>{

	
}
