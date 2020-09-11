package com.shoppingcart.spring.dao;

import java.util.List;

import com.shoppingcart.spring.entity.Ratings;

public interface IReviews {
	
	
	public List<Ratings> GetUserReview(int userid);
	public List<Ratings> GetProductReview(int productid);
	public void addorModifyReview(Ratings newreview);
	public Ratings getreview(int id);
	

}
