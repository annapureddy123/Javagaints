
<%@page import="com.telusko.Personal" %>
<%@ page import="com.telusko.BankInfo ,com.telusko.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
thank you visit again
	<h1>
		<font color=green size=10> Welcome to Ali baba bank</font>
</h1>	
<%
Personal p=(Personal)request.getSession().getAttribute("pinfo");
Contact c=(Contact)request.getSession().getAttribute("pinfo1");
BankInfo b=(BankInfo)request.getSession().getAttribute("pinfo2");
out.println(" first name : " +p.getfirstname()+"<br>");
out.println("last name : " +p.getLastname()+"<br>");
out.println("middle name:" +p.getMiddlename()+"<br>");
out.println("gender :" +p.getGender() +"<br>");
out.println("city : "+c.getCity()+"<br>");
out.print("Address :" +c.getAddress() +"<br>");
out.println("phone : "+c.getNum() +"<br>");
out.println("state : "+c.getState()+"<br>");
out.println("Account : "  +b.getAc()+"<br>");
out.println("bank name :" +b.getbName()+"<br>");

%>


</body>
</html>