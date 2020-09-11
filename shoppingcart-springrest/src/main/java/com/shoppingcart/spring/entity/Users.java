package com.shoppingcart.spring.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idusers")
	//@JsonView(View.Summary.class)
	private int iduser;
	
	@Column(name="username")
	private String uname;
	
	@Column(name="role")
	private String role;
	
	@Column(name="password")
	private String encryptedpassword;
	
	
	 public Users(String uname, String role, String encryptedpassword) {
		super();
		this.uname = uname;
		this.role = role;
		this.encryptedpassword = encryptedpassword;
	}
	public String getEncryptedpassword() {
		return encryptedpassword;
	}
	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private UserDetails userdetails;
	

	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails user) {
		this.userdetails = user;
	}
	@OneToMany(fetch=FetchType.LAZY,mappedBy="userratings",cascade=CascadeType.ALL)
	private List<Ratings>userratings;
	
	
	public Users()
	{
		
	}
	public List<Ratings> getUserratings() {
		return userratings;
	}
	public void setUserratings(List<Ratings> userratings) {
		this.userratings = userratings;
	}
	
	public Users(String uname, String role) {
		super();
		
		this.uname = uname;
		this.role = role;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void addReview(Ratings newrating)
	{
		if(userratings==null)
		{
			userratings=new ArrayList<Ratings>();
		}
		userratings.add(newrating);
		newrating.setUserratings(this);
	}
	@OneToOne
	(fetch = FetchType.LAZY, mappedBy = "suser", cascade = CascadeType.ALL)
	private ShoppingCart shoppingcart;
	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}
	public void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}
	@Override
	public String toString() {
		return "Users [iduser=" + iduser + ", uname=" + uname + ", role=" + role + ", encryptedpassword="
				+ encryptedpassword + "]";
	}
	
	


}
