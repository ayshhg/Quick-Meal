package com.shoppingcart.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CartPK implements Serializable {
	@Column(name="idshoppingcart")
	private int idshoppingcart;
	
	@Column(name="idproduct")
	private int idproduct;
	
	
	

}
