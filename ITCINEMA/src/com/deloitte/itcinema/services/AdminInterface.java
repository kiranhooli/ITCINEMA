package com.deloitte.itcinema.services;

import java.util.ArrayList;

import com.deloitte.itcinema.model.Admin;

public interface AdminInterface {
	public void register(String username,String email,String mobile,String password);

	public boolean login(String username, String password);

	public ArrayList<Admin> display();
}
