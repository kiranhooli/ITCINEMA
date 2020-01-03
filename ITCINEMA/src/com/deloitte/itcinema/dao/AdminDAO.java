package com.deloitte.itcinema.dao;

import java.sql.*;
import java.util.*;

import com.deloitte.itcinema.model.Admin;
import com.deloitte.itcinema.model.Admin;

public class AdminDAO {
	public Connection connectionToDB() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void insertData(Admin admin) {
		try {
			Connection con = connectionToDB();
			PreparedStatement st = con.prepareStatement("insert into movieadmin values (?,?,?,?)");
			st.setString(1, admin.getUsername());
			st.setString(2, admin.getEmail());
			st.setString(3, admin.getMobile());
			st.setString(4, admin.getPassword());

			st.executeUpdate();

			con.commit();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int login(String username, String password) {
		int pass = 0;
		try {
			Connection con = connectionToDB();
			PreparedStatement st = con.prepareStatement("select count(*) from movieadmin where username = ? and password = ?");
			st.setString(1, username);
			st.setString(2, password);

			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				pass = rs.getInt(1);
			} else {
				return 0;
			}
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
	}

	public ArrayList<Admin> display() {
		String sql = "select * from movieadmin";
		Statement st;
		Connection con = connectionToDB();
		ArrayList<Admin> admins = new ArrayList<Admin>();
		try {

			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Admin admin = new Admin();
				admin.setUsername(rs.getString(1));
				admin.setEmail(rs.getString(2));
				admin.setMobile(rs.getString(3));
				admin.setPassword(rs.getString(4));
				admins.add(admin);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admins;
	}
}
