package com.gcu.business;

import org.springframework.context.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@Configuration
public class SpringConfig {

	@Bean(name="ordersBusinessService")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)

	public OrdersBusinessInterface getOrdersBusiness() {
		
		return new OrdersBusinessService();
	}
}
