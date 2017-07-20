package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.service.BankService;

@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	BankInfo b=new BankInfo();
		b.setbName(request.getParameter("name"));
		b.setAc(request.getParameter("number"));
		b.setSsn(request.getParameter("n"));
        PrintWriter out =response.getWriter();
     
		    String error ="";
	     	if(check(b.getAc())){	
		     	error+="enter valid account ";}
			 if(check(b.getbName())){
				error+="enter valid bank name <br/>";}
			if (check(b.getSsn()) )
			 {
				error +="enter valid ssn  <br/>";
						}
			  if (check(error))
			  {
				HttpSession session =request.getSession();
				session.setAttribute("pinfo2", b);
				BankService bs=new BankService();
				try {
					bs.getBankService(b);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		    	response.sendRedirect("jsp/welcome.jsp");
				
				}  
	     	else {
			 RequestDispatcher rd =request.getRequestDispatcher("jsp/bankinfo.jsp");
			 request.setAttribute("error", error);
			rd.forward(request, response);
	
	     	}
			 
			  
		}

	private boolean check(String s) {
		return s==null||s.length()==0;
	}
	
	
	
	}


