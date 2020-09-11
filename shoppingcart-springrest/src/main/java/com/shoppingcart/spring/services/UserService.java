package com.shoppingcart.spring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.spring.dao.IUsersDao;
import com.shoppingcart.spring.dao.Reviews;
import com.shoppingcart.spring.dto.UserRegistrationDTO;
import com.shoppingcart.spring.dto.UsersDTO;
import com.shoppingcart.spring.entity.Ratings;
import com.shoppingcart.spring.entity.Users;



@Service
public class UserService {

	@Autowired
	private IUsersDao user;
	
	 @Autowired
	private ModelMapper modelMapper;
	
	@Transactional
	public List<UsersDTO> getusers() {
		List<Users> temp=user.getAll();
		return temp.stream().map(this::convertToDto).collect(Collectors.toList());
	}
     
	@Transactional
	public void registeruser(UserRegistrationDTO newuser)
	{
		Users temp=convertRegisterEntity(newuser);
		user.userregistration(temp);
		
	}
	@Transactional
	public void deleteuser(int userid)
	{
		user.delete(userid);
	}
	
	@Transactional
	public void adduserreview(int userid,Ratings newratings)
	{
		Users singleuser=user.getUser(userid);
		user.addUserReviews(newratings, singleuser);
	}
	
	
	//Converters----#####################################################################################################
	//Converters----#####################################################################################################


	private UsersDTO convertToDto(Users post) {
		UsersDTO postDto = modelMapper.map(post, UsersDTO.class);

	    return postDto;
	}
	
	private Users convertToEntity(UsersDTO user)
	{
		Users postentity=modelMapper.map(user,Users.class);
		return postentity;
	}
	private Users convertRegisterEntity(UserRegistrationDTO user)
	{
		Users postentity=modelMapper.map(user,Users.class);
		return postentity;
	}
	
}
