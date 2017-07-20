package com.telusko;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.telusko.service.ContactService;


@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Contact  c = new Contact();
	
		c.setAddress(request.getParameter("address"));
		c.setCity(request.getParameter("city"));
		c.setState(request.getParameter("state"));
		c.setNum(request.getParameter("num"));
	
		String error = "";

		if (check(c.getAddress())) {
			error += "enter address ";
		}
		if (check(c.getCity())) {
			error += "enter city ";
		}

		if (check(c.getState())) {
			error += "enter state";
		}
		if (check(c.getNum())) {
			error += "enter phone";
		}
		if (check(error)) {
			HttpSession session = request.getSession();
			session.setAttribute("pinfo1", c);
			ContactService cs =new ContactService();
			try {
				cs.getService(c);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				cs.getService(c);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("html/bankinfo.html");
		} else {
			request.setAttribute("error", error);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/contact.jsp");
			rd.forward(request, response);
		}

	}

	private boolean check(String s) {
		return s==null||s.length()==0;
	}
}
