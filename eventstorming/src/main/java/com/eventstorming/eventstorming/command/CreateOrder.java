package com.eventstorming.eventstorming.command;

import com.eventstorming.eventstorming.model.Orders;

public class CreateOrder {

	private Orders order;

	public CreateOrder(Orders order) {
		super();
		this.order = order;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
	
}
