package com.shoppingcart.spring.dao;

import java.util.List;

import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;

public interface IProducts {

	
	public List<Products> getAllproducts();
	public void updateproducts(Products newproduct);
	public void deleteproduct(int productid);
	public Products getProduct(int productid);
//	public void addproductreview(Ratings newrating);
	public List<Ratings> getProductreview(Products prod);
	
}
