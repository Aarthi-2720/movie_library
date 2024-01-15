<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="adminlogin" method="post">
	Admin Email:<input type="text" name="adminmail"><br>
	Admin Password:<input type="text" name="adminpass"><br>
	<button>Submit</button>
	</form>
	
	<% String message = (String)request.getAttribute("message"); %>
	<% if(message!=null){ %>
	<%= message %>
	<% } %>
</body>
</html>