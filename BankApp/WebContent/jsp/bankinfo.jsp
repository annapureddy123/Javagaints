<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BankInfoServlet" method="post">
<%
Object obj=request.getAttribute("pinfo2");
String errorMsg="";
if (obj!=null){
	errorMsg =(String)obj;
}
%>
<font color="blue" size="8"> <%= errorMsg %></font>
<br>
   Bank name  :<br><input type="text" name="name"  value=" "/><br/>
      Account  :<br><input type="text" name="number"  value=""/><br/>
        SSN :<br><input type="text" name="n"  value=" " /><br/>
     
          <input type="submit" value="next" />




</form>

</body>
</html>