package com.telusko.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.telusko.BankInfo;

public class BankDao
{
	public void getBankDao(BankInfo b) throws Exception
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "0");
			PreparedStatement ps =(PreparedStatement) con.prepareStatement("insert into bank values(?,?,?)");
			ps.setString(1,b.getbName());
			ps.setString(2,b.getAc());
			ps.setString(3,b.getSsn());
			ps.executeUpdate();
			
			System.out.print("bank table updated");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
			
		
	}

}
