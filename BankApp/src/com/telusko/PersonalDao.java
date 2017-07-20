package com.telusko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mysql.jdbc.Statement;

public class PersonalDao {
	Connection con = null;

	public PersonalDao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "0");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addPersonalDao(Personal p) throws Exception{
		// String url="jdbc:mysql://localhost:3306/test1";

		try {
			PreparedStatement st = con.prepareStatement("insert into personal values (?,?,?,?)");
			st.setString(1, p.getfirstname());
			st.setString(2, p.getLastname());
			st.setString(3, p.getMiddlename());
			st.setString(4, p.getGender());
			st.executeUpdate();
			con.close();
			System.out.println("table updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Personal> getAllDao() 
	{
		List<Personal> persons =new ArrayList<>();
		Personal  p=new Personal();
		String sql="select * from personal";
		try{
			java.sql.Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				p=new Personal();
			p.setfirstname(rs.getString(1));
			p.setLastname(rs.getString(2));
			p.setMiddlename(rs.getString(3));
			p.setGender(rs.getString(4));
			persons.add(p);
			}
		}
		catch (Exception e){
			
		}
		
		return persons;
	}

	public Personal getPersonalDao(String fname)
	{
		Personal p=new Personal();
		String sql = "select * from personal where firstname=' " +fname + " ' ";
		try{
		Statement st =(Statement) con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		p.setfirstname(rs.getString(1));
		p.setLastname(rs.getString(2));
		p.setMiddlename(rs.getString(3));
		p.setGender(rs.getString(4));
		
		
		}
		catch(Exception e){
			
		}
				return p;
	}

}
