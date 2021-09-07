package com.gcu.model;


public class OrderModel {
	private String id;
	private String orderNum, productName;
	private float price;
	private int quantity; 
	
	public OrderModel(String id, String on, String pn, float p, int q) {
		this.id = id;
		this.orderNum = on;
		this.productName = pn;
		this.price = p;
		this.quantity = q;
		
	}
	//GETTERS & SETTERS
	public String getId()
	{
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantitiy(int quantity) {
		this.quantity = quantity;
	}
}
