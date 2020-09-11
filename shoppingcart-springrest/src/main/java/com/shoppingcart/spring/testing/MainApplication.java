package com.shoppingcart.spring.testing;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.shoppingcart.spring.dao.IUsersDao;
import com.shoppingcart.spring.dao.UsersDao;
import com.shoppingcart.spring.entity.CartDetails;
import com.shoppingcart.spring.entity.OrderDetails;
import com.shoppingcart.spring.entity.Orders;
import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;
import com.shoppingcart.spring.entity.ShoppingCart;
import com.shoppingcart.spring.entity.UserDetails;
import com.shoppingcart.spring.entity.Users;






public class MainApplication {
	
	public static void main(String args[])
	{
		
	/*	SessionFactory sessionfactory=new Configuration().
				configure("hibernate.xml").
				addAnnotatedClass(Users.class).addAnnotatedClass(UserDetails.class).
				buildSessionFactory();
		*/		
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(UserDetails.class).addAnnotatedClass(Products.class).addAnnotatedClass(Ratings.class).addAnnotatedClass(CartDetails.class).addAnnotatedClass(ShoppingCart.class).addAnnotatedClass(Users.class).addAnnotatedClass(Orders.class).addAnnotatedClass(OrderDetails.class).configure();
		StandardServiceRegistryBuilder registry = new StandardServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		
		SessionFactory sessionfactory = configuration.buildSessionFactory(registry.build());
		 
		Session session = sessionfactory.openSession();
		
		try
		{
			int id=1;
			
			session.beginTransaction();
			/*
			/*Users x=new Users("ayshg","Admin");
			UserDetails y=new UserDetails("Ayush","Gupta","ayshhg@gmail.com","123456789","B-413");
			y.setUser(x);
			int productid=1;
		
			Products x=(Products) session.get(Products.class, productid);
		   System.out.println(x.getProductid()+" "+x.getProductname());
		   System.out.println("Reviews"+x.getProductreview().toString());
			//session.save(y);
			 
			 
			int userid=1;
			Users x=(Users) session.get(Users.class, userid);
			System.out.println(x.toString());
			System.out.println("Reviews"+x.getUserratings());
			*/
			
		/*	CartDetails x=(CartDetails) session.get(CartDetails.class, idshoppingcart);
			System.out.println(x.getIdproduct().getProductname());
		//	List<CartDetails> a=  session.createQuery("SELECT p FROM cartdetails p WHERE p.id equals :ids").setParameter("ids", idshoppingcart))).getResultList();
			*/
			/*ShoppingCart x=(ShoppingCart) session.get(ShoppingCart.class, idshoppingcart);
			System.out.println(x.getCartamount());
			CartDetails 
			System.out.println(x.getCartdetails().);
			*/
			/*OrderDetails x=(OrderDetails) session.get(OrderDetails.class, id);
			System.out.println(x.getIdproduct().getProductname());
			*/
			
			/*Orders x=(Orders) session.get(Orders.class, id);
			System.out.println(x.getOrderdetails());
			*/
			//UserDetails x=(UserDetails) session.get(UserDetails.class,1);
			//UserDetails temp=new UserDetails();
			//System.out.println(x.getFirstname()+x.getUser().getIduser()+" "+x.getUser().getUname());
			/*Users x=(Users) session.get(Users.class,id);
			System.out.println(x.getUserdetails().getEmailid());
*/
			
			//session.getTransaction().commit();
			//IUsersDao x=new UsersDao();
			//Users xx=new Users("admin","admin");
			//x.addUser(xx);
			//System.out.println(x.getAll().toString());

			//session.beginTransaction();

			Users x;
			Ratings xx;
			Products prod;
			int userid=4;
		/*	 x=(Users) session.get(Users.class, userid);
			System.out.println(x.toString());
			xx=new Ratings(5,"awesome");
			x.addReview(xx);
			session.save(x);
			x=(Users) session.get(Users.class, 2);
			System.out.println(x.toString());
			 xx=new Ratings(4,"good");
			x.addReview(xx);
			System.out.println("Reviews"+x.getUserratings());
			session.save(x);
			*/
			
				 x=(Users) session.get(Users.class, userid);
				 prod=(Products) session.get(Products.class, userid);
				// System.out.println(x.getShoppingcart());
				//ShoppingCart cart=new ShoppingCart(200);
				//x.setShoppingcart(cart);
				 //session.save(x);
			// System.out.println(x.getShoppingcart().getCartamount()+" "+x.getShoppingcart().getSuser());
					//session.flush();
//UserDetails temp=new UserDetails("asa","Asas","sasasxx","989898","Sdsd");
//x.setUserdetails(temp);
//temp.setUser(x);
				 
				// Ratings newrating=new Ratings(5,"perfect",x);
				 //prod.addReview(newrating);
				 //x.addReview(newrating);
              //session.saveOrUpdate(prod);;
				 System.out.println(prod.getProductreview().toString());
			session.getTransaction().commit();
					session.close();

			
		


		}
		finally
		{
		     // sessionfactory.close();
		}
		//System.out.println("How");
	}

}
