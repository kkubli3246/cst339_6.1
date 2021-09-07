package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.model.OrderModel;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity> {

	@Autowired
	private OrdersRepository ordersRepository;
	
	public OrderDataService(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}
	
	@Override
	public List<OrderEntity> findAll() {
		
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		
		try {
			Iterable<OrderEntity> orderIterable = ordersRepository.findAll();
			orders = new ArrayList<OrderEntity>();
			orderIterable.forEach(orders::add);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return orders;
		
	}


	@Override
	public OrderEntity findById(String id) {
		// TODO Auto-generated method stub
		return ordersRepository.getOrderById(id);
	}

	@Override
	public boolean create(OrderEntity order) {
		try {
			this.ordersRepository.save(order);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(OrderEntity order) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(OrderEntity order) {
		// TODO Auto-generated method stub
		return false;
	}

}
