package com.telusko;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetPersonalServlet")
public class GetPersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		String fname=request.getParameter("f");
    		
    		PersonalService ps=new PersonalService();
    	try {
			Personal p=	ps.getPersonalInfo(fname);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    
    		System.out.print("get servlet");
			}

}
