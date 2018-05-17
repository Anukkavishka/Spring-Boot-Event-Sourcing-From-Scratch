package com.eventstorming.eventstorming.event;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderEvent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long orderId;
	private long timestamp;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	private OrderEventType orderEventType;

	public OrderEventType getOrderEventType() {
		return orderEventType;
	}

	public void setOrderEventType(OrderEventType orderEventType) {
		this.orderEventType = orderEventType;
	}

	

	public OrderEvent(long orderId, OrderEventType orderEventType) {
		super();
	
		this.orderId = orderId;
		this.orderEventType = orderEventType;
		this.timestamp=new Date().getTime();
	}

	public OrderEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
