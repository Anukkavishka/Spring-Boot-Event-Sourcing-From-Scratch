package com.sample.evtsrcnorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.evtsrcnorder.model.Orders;

public interface OrderRepo extends JpaRepository<Orders,Long>{

	
}
