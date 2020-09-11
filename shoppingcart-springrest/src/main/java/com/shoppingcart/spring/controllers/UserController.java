package com.shoppingcart.spring.controllers;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.spring.dto.UserRegistrationDTO;
import com.shoppingcart.spring.dto.UsersDTO;
import com.shoppingcart.spring.dto.UsersTestingDTO;
import com.shoppingcart.spring.entity.Users;
import com.shoppingcart.spring.services.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	 private Logger logger = Logger.getLogger(getClass().getName());
	@GetMapping("/getAll")
	public List<UsersDTO> getAllUsers() {
		
		List<UsersDTO> temp=userservice.getusers();
		return temp;
				
	}
	
	@GetMapping("/register")
	public void registeration(@RequestBody UserRegistrationDTO newuser)
	{   
		
		userservice.registeruser(newuser);
	}
	 @GetMapping("/delete/{userid}")
	public void deleteuser(@PathVariable int userid)
	{
		 userservice.deleteuser(userid);
	}
	 
	 
	

}
