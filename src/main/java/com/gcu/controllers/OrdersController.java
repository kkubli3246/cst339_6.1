package com.gcu.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersBusinessInterface service;
	
	@GetMapping("/display")
	public String display(Model model) {
		System.out.println("Orders Controller");
		List<OrderModel> orders = service.getOrders();
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		
		
		return "orders";
	}
}
