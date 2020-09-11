package com.shoppingcart.spring.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Ratings")
public class Ratings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reviewid")
	private int ratingid;
	
	@Override
	public String toString() {
		return "Ratings [ratingid=" + ratingid + ", rating=" + rating + ", review=" + review + "]";
	}

	@Column(name="rating")
	private int rating;
	
	@Column(name="idusers",insertable = false, updatable = false)
	private int idusers;
	
	public int getIdproducts() {
		return idproducts;
	}



	public void setIdproducts(int idproducts) {
		this.idproducts = idproducts;
	}



	public int getIdusers() {
		return idusers;
	}



	public void setIdusers(int idusers) {
		this.idusers = idusers;
	}
	@Column(name="idproducts",insertable = false, updatable = false)
    private int idproducts;

	public Ratings()
	{
		
	}
	


	public int getRatingid() {
		return ratingid;
	}

	public void setRatingid(int ratingid) {
		this.ratingid = ratingid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}



	@Column(name="Review")
	private String review;
	@ManyToOne
	@JoinColumn(name="idproducts")
	private Products productid;
	
	public Ratings(int rating, String review, Users userratings) {
		super();
		this.rating = rating;
		this.review = review;
		this.userratings = userratings;
	}



	public Ratings(int rating, String review, Products productid) {
		super();
		this.rating = rating;
		this.review = review;
		this.productid = productid;
	}



	public Products getProductid() {
		return productid;
	}



	public void setProductid(Products productid) {
		this.productid = productid;
	}

	@ManyToOne
	@JoinColumn(name="idusers")
	private Users userratings;

	public Users getUserratings() {
		return userratings;
	}

	public void setUserratings(Users userratings) {
		this.userratings = userratings;
	}


	
	

}
