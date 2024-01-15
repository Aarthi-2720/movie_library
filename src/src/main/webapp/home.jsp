<%@page import="java.util.Base64" %>
<%@page import="DTO.Movie" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<h1>WELCOME</h1>
		
		<%List<Movie> movies = (List)request.getAttribute("movies"); %>
		 
		<table border="2px" class="table">
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Rating</th>
		<th>Genre</th>
		<th>Language</th>
		<th>Image</th>
		<th>Delete</th>
		<th>Edit</th>
		</tr>
		
		<%for(Movie m : movies){ %>
		
		<tr>
		<td><%=m.getMovieid()%></td>
		<td><%=m.getMoviename()%></td>
		<td><%=m.getMovieprice()%></td>
		<td><%=m.getMovierating()%></td>
		<td><%=m.getMoviegenre()%></td>
		<td><%=m.getMovielanguage()%></td>
		
		<% String base64image = new String(Base64.getEncoder().encode(m.getMovieimage())); %>
		<td><img src = "data:image/jpeg;base64, <%=base64image%>" height="100px" width="100px"></td>
		<td><a href="deletemovie?id=<%=m.getMovieid()%>">Delete</a></td>
		<td><a href="editmovie?id=<%=m.getMovieid()%>">Edit</a></td>
		</tr>
		<%} %>
		</table>
		
		<a href="addMovie.jsp">Add_Movie</a>
</body>
</html>