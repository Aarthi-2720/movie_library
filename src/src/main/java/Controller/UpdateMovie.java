package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.DaoClass;
import DTO.Movie;

@WebServlet("/updatemovie")
@MultipartConfig(maxFileSize = 5*1024*1024)
public class UpdateMovie extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int movieid = Integer.parseInt(req.getParameter("movieid"));
		String moviename = req.getParameter("moviename");
		int movieprice = Integer.parseInt(req.getParameter("movieprice"));
		int movierating = Integer.parseInt(req.getParameter("movierating"));
		String moviegenre = req.getParameter("moviegenre");
		String movielanguage = req.getParameter("movielanguage");
		Part imagepart = req.getPart("movieimage");
		
		Movie movie = new Movie();
		movie.setMovieid(movieid);
		movie.setMoviename(moviename);
		movie.setMovieprice(movieprice);
		movie.setMovierating(movierating);
		movie.setMoviegenre(moviegenre);
		movie.setMovielanguage(movielanguage);
       
		if(imagepart.getInputStream().readAllBytes().length>0)
		{
			movie.setMovieimage(imagepart.getInputStream().readAllBytes());
		}
		else {
			
			DaoClass dao = new DaoClass();
			Movie m;
			
			try {
				m=dao.findMovieById(movieid);
				byte[] img = m.getMovieimage();
				movie.setMovieimage(img);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		try {
			DaoClass dao = new DaoClass();
			dao.updateMovie(movie);
			req.setAttribute("movies", dao.getAllMovies());
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.include(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}







