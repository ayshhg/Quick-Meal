package com.shoppingcart.spring.dto;

public class UsersTestingDTO {
	
	 private int iduser;
	 private String uname;

		private String role;
		private String encryptedpassword;
		public int getIduser() {
			return iduser;
		}
		@Override
		public String toString() {
			return "UsersTestingDTO [iduser=" + iduser + ", uname=" + uname + ", role=" + role + ", encryptedpassword="
					+ encryptedpassword + "]";
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
		public String getEncryptedpassword() {
			return encryptedpassword;
		}
		public void setEncryptedpassword(String encryptedpassword) {
			this.encryptedpassword = encryptedpassword;
		}

}
