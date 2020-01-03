package com.deloitte.itcinema.main;

import java.util.*;

import com.deloitte.itcinema.model.Admin;
import com.deloitte.itcinema.services.AdminImpl;

public class AppDemo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		List<Admin> admins = new ArrayList<Admin>();
		
		AdminImpl adminimpl = new AdminImpl();
		while(true) {
		System.out.println("1.Register\n2.Login\n3.Display\n4.Exit");
		int op = Integer.parseInt(in.next());
		
		switch(op) {
		case 1:
			System.out.print("Enter Username : ");
			String username = in.next();
			
			System.out.print("Enter Email : ");
			String email = in.next();
			
			System.out.print("Enter mobile : ");
			String mobile = in.next();
			
			System.out.print("Enter Password : ");
			String password = in.next();
			
			adminimpl.register(username,email,mobile,password);
			System.out.println("Admin Data Uploaded.");
			break;
		case 2:
			System.out.print("Enter Username : ");
			username = in.next();
			
			System.out.print("Enter Password : ");
			password = in.next();
			
			boolean status = adminimpl.login(username, password);
			if(status) {
				System.out.println("Login Success.");
			}else {
				System.out.println("Login Failed");
			}
			
			break;
		case 3:
				admins = adminimpl.display();
			for(Admin ad:admins) {
				System.out.println(ad);
			}
			
			break;
		case 4:
			System.exit(0);
			break;
		}
		}
	}
}
