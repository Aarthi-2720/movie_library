<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>ADD MOVIE</h3>
	
	<form action="savemovie" method="post" enctype="multipart/form-data">
	MovieId<input type="text" name="movieid"><br>
	MovieName<input type="text" name="moviename"><br>
	MoviePrice<input type="text" name="movieprice"><br>
	MovieRating<input type="text" name="movierating"><br>
	MovieGenre<input type="text" name="moviegenre"><br>
	MovieLanguage<input type="text" name="movielanguage"><br>
	MovieImage<input type="file" name="movieimage"><br>
	<button>Submit</button>
	</form>
</body>
</html>