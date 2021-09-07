package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface{

	@Autowired
	OrderDataService service;
	
	@Override
	public List<OrderModel> getOrders() {
		List<OrderEntity> ordersEntity = service.findAll();
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity e : ordersEntity) {
			ordersDomain.add(new OrderModel(e.getId(),e.getOrderNo(), e.getProductName(), e.getPrice(), e.getQuantity()));
		}
		
		return ordersDomain;
	}
	
	public OrderModel getOrderById(String id) {
		OrderEntity e = service.findById(id);
		
		return new OrderModel(e.getId(),e.getOrderNo(), e.getProductName(), e.getPrice(), e.getQuantity());
	}


}
