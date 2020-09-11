package com.shoppingcart.spring.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idorders;
	
	@OneToOne
	@JoinColumn(name="idusers")
	private Users iduser;
	
	@Column(name="orderamount")
	private int orderamount;
	
	@Column(name="orderstatus")
	private String orderstatus;
	
	@OneToMany(mappedBy="orders")
	private List<OrderDetails> orders;

	public int getIdorders() {
		return idorders;
	}

	public void setIdorders(int idorders) {
		this.idorders = idorders;
	}

	public Users getIduser() {
		return iduser;
	}

	public void setIduser(Users iduser) {
		this.iduser = iduser;
	}

	public int getOrderamount() {
		return orderamount;
	}

	public void setOrderamount(int orderamount) {
		this.orderamount = orderamount;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public List<OrderDetails> getOrderdetails() {
		return orders;
	}

	public void setOrderdetails(List<OrderDetails> orders) {
		this.orders = orders;
	}
     public Orders()
     {
    	 
     }
	public Orders(Users iduser, int orderamount) {
		super();
		this.iduser = iduser;
		this.orderamount = orderamount;
	}
	

}
