<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ContactServlet" method="post">
<%
Object obj=request.getAttribute("error");
String errormsg =" ";
if(obj!=null){
	errormsg+=(String)obj;
	
}
%>
	<font color=red size=6> <%=errormsg%></font>
		<br>
		 Address:<br> <input type="text" name="Address" value=""><br>
	     city:<br> <input type="text" name="city"	value=""> <br>
		state:<br> <input type="text" name="state"	value="">  <br>
		phone :<br><input type="text" name="num" value=""><br>
		
		<input type='submit' value="submit"></input> <br>
</form>
</body>

</html>