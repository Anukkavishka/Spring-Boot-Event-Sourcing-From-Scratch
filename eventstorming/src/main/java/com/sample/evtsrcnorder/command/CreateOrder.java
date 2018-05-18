package com.sample.evtsrcnorder.command;

import com.sample.evtsrcnorder.model.Orders;

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
