package com.shoppingcart.spring.dto;

public class UserRegistrationDTO extends UsersDTO{
	
private String encryptedpassword;



public String getEncryptedpassword() {
	return encryptedpassword;
}



public void setEncryptedpassword(String encryptedpassword) {
	this.encryptedpassword = encryptedpassword;
}



@Override
public String toString() {
	return "UserRegistrationDTO [password=" + encryptedpassword + ", getIduser()=" + getIduser() + ", getUname()=" + getUname()
			+ ", getRole()=" + getRole() + "]";
}

}
