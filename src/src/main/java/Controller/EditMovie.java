package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DaoClass;
import DTO.Movie;

@WebServlet("/editmovie")
public class EditMovie extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int id = Integer.parseInt(req.getParameter("id"));
			
			try {
				DaoClass dao = new DaoClass();
				Movie m = dao.findMovieById(id);
				req.setAttribute("movie", m);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("editMovie.jsp");
				dispatcher.include(req, resp);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
