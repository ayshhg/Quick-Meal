package com.shoppingcart.spring.dto;

public class AddReviewsDTO {
	
	private String review;
	
	private int rating;
	
	private int idproducts;

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getIdproducts() {
		return idproducts;
	}

	public void setIdproducts(int idproducts) {
		this.idproducts = idproducts;
	}
	
	
	

}
