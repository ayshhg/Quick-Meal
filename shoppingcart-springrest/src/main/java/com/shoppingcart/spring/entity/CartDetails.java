package com.shoppingcart.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartdetails")
public class CartDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cartid")
	private int cartid;
	
	@Column(name="idshoppingcart",insertable=false, updatable=false)
	private int idshoppingcart;
	
	@Column(name="quantity")
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}
	public void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	@ManyToOne
	@JoinColumn(name="idshoppingcart")
	private ShoppingCart shoppingcart;
	
	@OneToOne()
	@JoinColumn(name="idproducts")
	private Products idproduct;
	
	
	
	public CartDetails()
	{
		
	}
	public CartDetails(int cartid, int idshoppingcart,int quantity) {
		super();
		this.cartid = cartid;
		this.idshoppingcart = idshoppingcart;
		this.quantity=quantity;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getIdshoppingcart() {
		return idshoppingcart;
	}

	public void setIdshoppingcart(int idshoppingcart) {
		this.idshoppingcart = idshoppingcart;
	}

	public Products getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(Products idproduct) {
		this.idproduct = idproduct;
	}	
	
	

}
