package com.gcu.business;

import java.util.List;

import org.springframework.ui.Model;

import com.gcu.model.OrderModel;

public interface OrdersBusinessInterface {
	public List<OrderModel> getOrders();
	public OrderModel getOrderById(String id);
	
}
