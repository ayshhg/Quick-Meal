package com.shoppingcart.spring.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
/*	
	@Id
	@Column(name="idusers",insertable=false, updatable=false)
     private int iduser;
	
	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
   
*/
	@Column(name="firstname")
	private String firstname;
	
	

	@Column(name="lastname")
	private String lastname;
	
	@Id
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="phoneno")
	private String phoneno;
	
	@Column(name="hosteldetails")
	private String hosteldetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idusers")
	private Users user;
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public UserDetails(String firstname, String lastname, String emailid, String phoneno, String hosteldetails) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.hosteldetails = hosteldetails;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getHosteldetails() {
		return hosteldetails;
	}

	public void setHosteldetails(String hosteldetails) {
		this.hosteldetails = hosteldetails;
	}


	
	public UserDetails()
	{
		
	}
	
	
	

}
