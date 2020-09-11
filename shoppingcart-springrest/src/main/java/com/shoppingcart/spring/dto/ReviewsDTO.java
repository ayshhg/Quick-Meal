package com.shoppingcart.spring.dto;

public class ReviewsDTO {
	
	private int ratingid;

	private String review;
	
	private int rating;
	
	private UsernameDTO userratings;

	public int getRatingid() {
		return ratingid;
	}

	public void setRatingid(int ratingid) {
		this.ratingid = ratingid;
	}

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

	public UsernameDTO getUserratings() {
		return userratings;
	}

	public void setUserratings(UsernameDTO userratings) {
		this.userratings = userratings;
	}

	


}
