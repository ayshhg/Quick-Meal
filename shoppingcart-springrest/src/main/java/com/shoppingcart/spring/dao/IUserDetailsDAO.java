package com.shoppingcart.spring.dao;

import com.shoppingcart.spring.entity.UserDetails;

public interface IUserDetailsDAO {
	public void addUserDetails(UserDetails user);
	public UserDetails getUserDetails(int id);


}
