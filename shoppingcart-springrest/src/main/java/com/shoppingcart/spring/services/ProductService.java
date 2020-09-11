package com.shoppingcart.spring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.spring.dao.IProducts;
import com.shoppingcart.spring.dto.ProductsAdminDTO;
import com.shoppingcart.spring.dto.ProductsDTO;
import com.shoppingcart.spring.dto.ReviewsDTO;
import com.shoppingcart.spring.entity.Products;
import com.shoppingcart.spring.entity.Ratings;




@Service
public class ProductService {
	@Autowired
	private IProducts products;
	@Autowired
	private ModelMapper modelMapper;

	
	@Transactional
	public List<ProductsDTO> getAllProducts() {
		
		
		List<Products> allproduct=products.getAllproducts();
		return allproduct.stream()
		          .map(this::convertToDto)
		          .collect(Collectors.toList());
	
	}
	@Transactional
    public void modifyorAddproduct(ProductsAdminDTO newproduct)
    {  
    	Products product=AdminToEntity(newproduct);
    	products.updateproducts(product);
    }
	@Transactional
    public Products getProduct(int productid)
    {
    	return products.getProduct(productid);
    }
	@Transactional
    public void deleteProduct(int productid)
    {
    	products.deleteproduct(productid);
    }
	@Transactional
	public List<ReviewsDTO> getproductreviews(int productid)
	{
		Products tempproduct=products.getProduct(productid);
		List<Ratings> productreview=products.getProductreview(tempproduct);
		
		return productreview.stream()
		          .map(this::convert)
		          .collect(Collectors.toList());
	
	}
	
	
	
	
	
	//Converters----#####################################################################################################
	//Converters----#####################################################################################################

	private ProductsDTO convertToDto(Products post) {
		ProductsDTO postDto = modelMapper.map(post, ProductsDTO.class);

	    return postDto;
	}
	private Products convertToEntity(ProductsDTO user)
	{
		Products postentity=modelMapper.map(user,Products.class);
		return postentity;
	}
	private Products AdminToEntity(ProductsAdminDTO user)
	{
		Products postentity=modelMapper.map(user,Products.class);
		return postentity;
	}
	private ReviewsDTO convert(Ratings review)
	{
		ReviewsDTO temp=modelMapper.map(review,ReviewsDTO.class);
		return temp;
	}
	
	
}
