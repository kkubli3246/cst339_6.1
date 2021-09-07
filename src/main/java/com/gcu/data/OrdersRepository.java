package com.gcu.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
	
	OrderEntity getOrderById(String id);
}
