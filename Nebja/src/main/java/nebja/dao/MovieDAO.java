package nebja.dao;

import java.sql.Blob;
import java.util.List;

import nebja.beans.Movie;

public interface MovieDAO {
	public List<Movie> getAllMovies();
	public double getMovieScore(int movieid);
	public Blob getMoviePoster(int movieid);
	public String getMovieTitle(int movieid);
}
