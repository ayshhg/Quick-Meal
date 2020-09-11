package com.shoppingcart.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;
import com.shoppingcart.spring.entity.Users;


@Repository
public class UsersDao  implements IUsersDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	

	
	public Users getUser(int id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
         Users temp=currentSession.get(Users.class, id);
		return temp;
	}
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<Users> theQuery =  currentSession.createQuery("from Users",Users.class);
		
		// execute query and get result list
		List<Users> users = theQuery.getResultList();
				
		// return the results		
		return users;
        }


	public void userregistration(Users newuser) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(newuser);
		
	}
	public void delete(int userid) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Users> theQuery = 
				currentSession.createQuery("delete from Users where id=:userid");
		theQuery.setParameter("userid", userid);
		
		theQuery.executeUpdate();
		
	}
	@Override
	public void addUserReviews(Ratings newrating, Users user) {
		Session currentSession = sessionFactory.getCurrentSession();
          user.addReview(newrating);
          currentSession.saveOrUpdate(user);
		
	}
	@Override
	public List<Ratings> getUserReviews(Users user) {
		Session currentSession = sessionFactory.getCurrentSession();
         List<Ratings> reviews=user.getUserratings();
		return reviews;
	}

	



}
