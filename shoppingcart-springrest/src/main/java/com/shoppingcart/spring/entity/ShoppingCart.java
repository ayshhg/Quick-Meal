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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shoppingcart")
public class ShoppingCart {
	
	public ShoppingCart()
	{
		
	}
	public ShoppingCart(int cartamount) {
		super();
		this.cartamount = cartamount;
	}

	public int getIdshoppingcart() {
		return idshoppingcart;
	}

	public void setIdshoppingcart(int idshoppingcart) {
		this.idshoppingcart = idshoppingcart;
	}



	public Users getSuser() {
		return suser;
	}
	public void setSuser(Users suser) {
		this.suser = suser;
	}
	public int getCartamount() {
		return cartamount;
	}

	public void setCartamount(int cartamount) {
		this.cartamount = cartamount;
	}

	public List<CartDetails> getCartdetails() {
		return cartdetails;
	}

	public void setCartdetails(List<CartDetails> cartdetails) {
		this.cartdetails = cartdetails;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idshoppingcart;
	
	@OneToOne
	@JoinColumn(name="idusers")
	private Users suser;
	
	@Override
	public String toString() {
		return "ShoppingCart [idshoppingcart=" + idshoppingcart + ", user=" + suser + ", cartamount=" + cartamount + "]";
	}

	@Column(name="cartamount")
	private int cartamount;
	
	@OneToMany(mappedBy="shoppingcart")
	private List<CartDetails> cartdetails;
	

}
