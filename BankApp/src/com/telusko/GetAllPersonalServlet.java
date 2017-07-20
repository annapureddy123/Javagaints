package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetAllPersonalServlet")
public class GetAllPersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		PersonalService ps = new PersonalService();
		List<Personal> personals = ps.getAll();

		for (Personal p : personals) {
			out.println("firstname : " + p.getfirstname() + "<br>" + "lastname : " + p.getLastname() + "</br>"
					+ "middle name : " + p.getMiddlename() + " </br>" + " gender : " + p.getGender() + "</br>");
		}
	}

}
