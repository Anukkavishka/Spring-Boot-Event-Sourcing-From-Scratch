package com.eventstorming.eventstorming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Orders {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long orderId;

private String customerName;
private OrderStatus orderStatus;
private long prodcutId;
private double qty;

public long getOrderId() {
	return orderId;
}
public void setOrderId(long orderId) {
	this.orderId = orderId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public OrderStatus getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(OrderStatus orderStatus) {
	this.orderStatus = orderStatus;
}
public long getProdcutId() {
	return prodcutId;
}
public void setProdcutId(long prodcutId) {
	this.prodcutId = prodcutId;
}
public double getQty() {
	return qty;
}
public void setQty(double qty) {
	this.qty = qty;
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
public Orders(long orderId, String customerName, long prodcutId, double qty) {
	super();
	this.orderId = orderId;
	this.customerName = customerName;
	this.orderStatus =OrderStatus.PENDING;
	this.prodcutId = prodcutId;
	this.qty = qty;
}



}
