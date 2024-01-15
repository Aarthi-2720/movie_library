package DTO;

import java.util.Arrays;

public class Movie {

	
	private int movieid;
	private String moviename;
	private int movieprice;
	private int movierating;
	private String moviegenre;
	private String movielanguage;
	private byte[] movieimage;
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getMovieprice() {
		return movieprice;
	}
	public void setMovieprice(int movieprice) {
		this.movieprice = movieprice;
	}
	public int getMovierating() {
		return movierating;
	}
	public void setMovierating(int movierating) {
		this.movierating = movierating;
	}
	public String getMoviegenre() {
		return moviegenre;
	}
	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}
	public String getMovielanguage() {
		return movielanguage;
	}
	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}
	public byte[] getMovieimage() {
		return movieimage;
	}
	public void setMovieimage(byte[] movieimage) {
		this.movieimage = movieimage;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", movieprice=" + movieprice
				+ ", movierating=" + movierating + ", moviegenre=" + moviegenre + ", movielanguage=" + movielanguage
				+ ", movieimage=" + Arrays.toString(movieimage) + "]";
	}
	
	
	
}
