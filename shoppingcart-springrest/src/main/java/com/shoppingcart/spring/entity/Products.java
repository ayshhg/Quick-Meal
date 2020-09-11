package com.shoppingcart.spring.entity;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproducts")
    private int productid;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="productdesc")
	private String productdesc;
	
	@Column(name="productquantity")
	private int productquantity;
	
	@Column(name="ImageUrl")
	private String ImageUrl;
	
	@Column(name="productprice")
	private int price;
	
	@Column(name="category")
	private String category;
	
	@OneToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.ALL},mappedBy="productid")
	private List<Ratings> productreview;
	
	//@ManytoOne
	//@JoinColumn()
//	private CartDetails cartid;

	public List<Ratings> getProductreview() {
		return productreview;
	}

	public void setProductreview(List<Ratings> productreview) {
		this.productreview = productreview;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public void addReview(Ratings newrating)
	{
		if(productreview==null)
		{
			productreview=new ArrayList<Ratings>();
		}
		productreview.add(newrating);
		newrating.setProductid(this);
	
	}
	public Products()
	{
		
	}

	public Products(String productname, String productdesc, int productquantity, String imageUrl, int price,
			String category) {
		super();
		this.productname = productname;
		this.productdesc = productdesc;
		this.productquantity = productquantity;
		ImageUrl = imageUrl;
		this.price = price;
		this.category = category;
	}
 
	

}
