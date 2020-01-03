package com.deloitte.itcinema.model;

public class Admin {
	private String username;
	private String email;
	private String mobile;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [\nusername=" + username + ", \nemail=" + email + ", \nmobile=" + mobile + ", \npassword="
				+ password + "]\n******************\n";
	}

}
