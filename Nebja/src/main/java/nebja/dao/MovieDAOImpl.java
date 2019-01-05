package nebja.dao;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.Movie;
import nebja.util.NebjaUtil;

public class MovieDAOImpl implements MovieDAO {
static SessionFactory sf = NebjaUtil.getSessionFactory();

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<>();	
		try(Session s = sf.getCurrentSession()){
				Transaction tx = s.beginTransaction();
				movies = s.createQuery("from Movie").getResultList();
				tx.commit();
				s.close();
		}
		return movies;
	}

	@Override
	public double getMovieScore(int movieid) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
		Movie m = s.get(Movie.class, movieid);
		double d = m.getAvgscore();
		return d;
		}
		
	}

	@Override
	public Blob getMoviePoster(int movieid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMovieTitle(int movieid) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			Movie m = s.get(Movie.class,movieid);
			String title = m.getTitle();
			return title;
		}
		
	}

}
