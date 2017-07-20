package com.telusko;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		Personal p = new Personal();
		p.setfirstname(request.getParameter("f"));
		p.setMiddlename(request.getParameter("m"));
		p.setLastname(request.getParameter("l"));
		p.setGender(request.getParameter("gender"));

		String error = "";
		if (check(p.getfirstname())) {
			error = error + "first name blank<br/>"; // errors+="";
		}
		if (check(p.getLastname())) {
			error += "last name blank <br/>";
		}
		if (check(p.getMiddlename())) {
			error += "middle is blank";
		}
		if (check(p.getGender())) {
			error += "gender is empty ";
		}
		if (check(error)) {
			HttpSession s = request.getSession();
			s.setAttribute("pinfo", p);
			PersonalService ps = new PersonalService();
			try {
				ps.addPersonalService(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("login called ");
			response.sendRedirect("html/contact.html");
		} else {
			request.setAttribute("error", error);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
			rd.forward(request, response);
		}

	}

	private boolean check(String s) {
		return s == null || s.length() == 0;
	}

}