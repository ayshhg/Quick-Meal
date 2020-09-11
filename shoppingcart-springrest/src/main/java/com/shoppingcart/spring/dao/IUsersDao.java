package com.shoppingcart.spring.dao;

import java.util.List;

import com.shoppingcart.spring.entity.Ratings;
import com.shoppingcart.spring.entity.Users;


public interface IUsersDao {
	
public List<Users> getAll();

public void userregistration(Users newuser);

public void delete(int userid);
public Users getUser(int id);

public void addUserReviews(Ratings newrating,Users user);
public List<Ratings> getUserReviews(Users user);


}
