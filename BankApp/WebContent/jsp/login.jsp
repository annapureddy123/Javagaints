<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="LoginServlet">

		<%
			Object obj = request.getAttribute("error");
			String errorMsg = "";
			if (obj != null) {
				errorMsg = (String)obj;
			}
		%>

		<font color=red size=6> <%=errorMsg%></font>
		<br>
		 First name:<br> <input type="text" name="f" value=""><br>
	     Middle name:<br> <input type="text" name="m"	value=""> <br>
		Last name:<br> <input type="text" name="l"	value="">  <br>
			 	 <input type="radio"
			name="gender" value="male"> Male<br> 
			<input type="radio" name="gender" value="female"> Female<br>
			 <input type="radio" name="gender" value="other"> Other <br> <br>
		<input type='submit' value="submit"></input> <br>
	</form>

	<p>Click on submit to go to contact info" </p>

</body>
</html>