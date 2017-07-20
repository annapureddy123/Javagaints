package com.telusko.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.telusko.Contact;

public class ContactDao {
	public ContactDao() {
		System.out.print("contact info about to start");
	}

	public void getContactDao(Contact c) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "0");
			PreparedStatement ps = con.prepareStatement("insert into contact values(?,?,?,?)");
			ps.setString(1, c.getCity());
			ps.setString(2, c.getAddress());
			ps.setString(3, c.getState());
			ps.setString(4, c.getNum());
			ps.executeUpdate();

			con.close();

			System.out.print(" contact table updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
