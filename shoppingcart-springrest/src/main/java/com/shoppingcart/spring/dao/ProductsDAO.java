package com.shoppingcart.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;

@Repository
public class ProductsDAO implements IProducts {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Products> getAllproducts() {
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<Products> theQuery =  currentSession.createQuery("from Products",Products.class);
		
		List<Products> product = theQuery.getResultList();
		
		return product;
		
	}

	@Override
	public void updateproducts(Products newproduct) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(newproduct);

	}

	@Override
	public void deleteproduct(int productid) {
		Session currentSession = sessionFactory.getCurrentSession();
	
		Query<Products> theQuery = 
				currentSession.createQuery("delete from Products where id=:productid");
		theQuery.setParameter("productid", productid);
		
		theQuery.executeUpdate();	

	}

	@Override
	public Products getProduct(int productid) {
		Session currentSession = sessionFactory.getCurrentSession();
         Products product=currentSession.get(Products.class, productid);
		return product;
	}

	@Override
	public List<Ratings> getProductreview(Products prod) {
		Session currentSession = sessionFactory.getCurrentSession();
		
        List<Ratings> reviews=prod.getProductreview();
        return reviews;

	}
	


}
