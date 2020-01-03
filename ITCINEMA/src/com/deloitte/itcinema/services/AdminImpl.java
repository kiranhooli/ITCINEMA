package com.deloitte.itcinema.services;

import java.util.ArrayList;

import com.deloitte.itcinema.dao.AdminDAO;
import com.deloitte.itcinema.model.Admin;

public class AdminImpl implements AdminInterface {

	AdminDAO adminDAO = new AdminDAO();
	

	@Override
	public void register(String username,String email,String mobile,String password) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		
		admin.setUsername(username);
		admin.setEmail(email);
		admin.setMobile(mobile);
		admin.setPassword(password);
		
		adminDAO.insertData(admin);
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		int pass = adminDAO.login(username,password);
		if (pass !=0)
			return true;
		else
			return false;
	}

	@Override
	public ArrayList<Admin> display() {
		// TODO Auto-generated method stub
		return adminDAO.display();
	}

}
