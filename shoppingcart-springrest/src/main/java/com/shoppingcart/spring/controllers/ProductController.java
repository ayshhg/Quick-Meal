package com.shoppingcart.spring.controllers;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.spring.dto.ProductsAdminDTO;
import com.shoppingcart.spring.dto.ProductsDTO;
import com.shoppingcart.spring.dto.ReviewsDTO;
import com.shoppingcart.spring.dto.UsersDTO;
import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;
import com.shoppingcart.spring.entity.Users;
import com.shoppingcart.spring.services.ProductService;
import com.shoppingcart.spring.services.UserService;



@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	
	 private Logger logger = Logger.getLogger(getClass().getName());

	@Autowired
	private ProductService productservice;
	
	 @Autowired
	 
	 @GetMapping("/getall")
      public List<ProductsDTO> testing() {
		
		
		
		return productservice.getAllProducts();

		
		
	}
	 @GetMapping("/add")
       public void addProduct(@RequestBody ProductsAdminDTO newproduct)
       {
		 productservice.modifyorAddproduct(newproduct);
       }
	 @GetMapping("/modify")
     public void ModifyProduct(@RequestBody ProductsAdminDTO modifiedproduct)
     {
		 productservice.modifyorAddproduct(modifiedproduct);
     }
	 @GetMapping("/delete/{productid}")
     public void DeleteProduct(@PathVariable int productid)
     {
		 productservice.deleteProduct(productid);
	 }
	 
	 @GetMapping("/reviews/{productid}")
	 public List<ReviewsDTO> GetProductReview(@PathVariable int productid)
	 {
		 return productservice.getproductreviews(productid);
		 	 
	 }
	 
	

}
