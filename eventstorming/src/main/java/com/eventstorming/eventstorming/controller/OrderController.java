package com.eventstorming.eventstorming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eventstorming.eventstorming.event.OrderEvent;
import com.eventstorming.eventstorming.event.OrderEventType;
import com.eventstorming.eventstorming.model.OrderStatus;
import com.eventstorming.eventstorming.model.Orders;
import com.eventstorming.eventstorming.service.OrderEventService;
import com.eventstorming.eventstorming.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

@Autowired
private OrderService orderService;

@Autowired
private OrderEventService orderEventService;


/*@RequestMapping(method=RequestMethod.POST,value="")
public void addOrder(@RequestBody Orders order) {
	
	orderService.insertOrder(order);
}*/

@RequestMapping(method=RequestMethod.GET,value="")
public List<Orders> getOrder() {
	
	return orderService.getAll();
}

@RequestMapping(method=RequestMethod.GET,value="/orderevents")
public List<OrderEvent> getOrderEvents() {
	
	return orderEventService.getAll();
}

@RequestMapping(method=RequestMethod.POST,value="/create")
public Orders createOrder(@RequestBody Orders order) {
	
	//Orders order=createOrder.getOrder();
	orderService.insertOrder(order);
	orderEventService.insertOrderEvent(new OrderEvent(order.getOrderId(),OrderEventType.CREATED));
	
	
	return order;
}

@RequestMapping(method=RequestMethod.POST,value="{id}/approve")
public Orders approveOrder(@PathVariable long id) {
	
	Orders order=orderService.getOrder(id);
	
	OrderStatus status=order.getOrderStatus();
	
		if(status==OrderStatus.PENDING) {
			
			//in here you have to find that there is enough qty for the order
			order.setOrderStatus(OrderStatus.PROCESSED);
			orderService.insertOrder(order);
		}else if(status==OrderStatus.PROCESSED) {
			
			orderEventService.insertOrderEvent(new OrderEvent(order.getOrderId(),OrderEventType.APPROVED));
	
		}else {
			//qty not available
			orderEventService.insertOrderEvent(new OrderEvent(order.getOrderId(),OrderEventType.REJECTED));
			
		}
	
	return order;
}


}
