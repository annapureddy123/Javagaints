package com.telusko.service;

import java.sql.SQLException;

import com.telusko.Contact;
import com.telusko.dao.ContactDao;

public class ContactService
{
public void getService(Contact c) throws SQLException
	{
		ContactDao dao =new ContactDao();
		dao.getContactDao(c);
		System.out.print(c.getCity());
		
	}

}
