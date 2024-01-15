<%@page import="java.util.Base64"%>
<%@page import="DTO.Movie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%Movie m = (Movie)request.getAttribute("movie");%>
	
	<form action="updatemovie" method="post" enctype="multipart/form-data">
	MovieId<input type="text" name="movieid" value="<%= m.getMovieid()%>"readonly><br>
	MovieName<input type="text" name="moviename" value="<%= m.getMoviename()%>"> <br>
	MoviePrice<input type="text" name="movieprice" value="<%= m.getMovieprice()%>"><br>
	MovieRating<input type="text" name="movierating" value="<%= m.getMovierating()%>"><br>
	MovieGenre<input type="text" name="moviegenre" value="<%= m.getMoviegenre()%>"><br>
	MovieLanguage<input type="text" name="movielanguage" value="<%= m.getMovielanguage()%>"><br>
	MovieImage<input type="file" name="movieimage"><br>
	<button>Submit</button>
	</form>
	
	<% String base64image = new String(Base64.getEncoder().encode(m.getMovieimage())); %>
	<img src = "data:image/jpeg;base64, <%=base64image%>" height="100px" width="100px">
</body>
</html>