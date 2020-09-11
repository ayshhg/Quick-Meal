package com.shoppingcart.spring.dao;

import java.util.List;

import com.shoppingcart.spring.entity.Orders;

public interface IOrders {
	
	public List<Orders> getAllOrders();
	public List<Orders> getUserOrders();
	public void newuserorder(Orders neworders);
	

}
