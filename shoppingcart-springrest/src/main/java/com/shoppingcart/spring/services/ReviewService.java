package com.shoppingcart.spring.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoppingcart.spring.dao.IReviews;


public class ReviewService {

	@Autowired
	private IReviews reviews;
	
	 @Autowired
	private ModelMapper modelMapper;
	 
	 public List<> getAllProductReview(int productid)
	 {
		 
	 }
}
