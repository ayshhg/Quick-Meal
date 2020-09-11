package com.shoppingcart.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rowid")
	private int rowid;
	
	
	@Column(name="quantity")
	private int quantity;
	
	@OneToOne()
	@JoinColumn(name="idproducts")
	private Products idproduct;
	
	@ManyToOne
	@JoinColumn(name="idorders")
	private Orders orders;
     
	public OrderDetails()
	{
		
	}
	public OrderDetails(int rowid, int quantity) {
		super();
		this.rowid = rowid;
	
		this.quantity = quantity;
	}

	public int getRowid() {
		return rowid;
	}

	public void setRowid(int rowid) {
		this.rowid = rowid;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Products getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(Products idproduct) {
		this.idproduct = idproduct;
	}

	public Orders getIdorder() {
		return orders;
	}

	public void setIdorder(Orders idorder) {
		this.orders = orders;
	}

}
