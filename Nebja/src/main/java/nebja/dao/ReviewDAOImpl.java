package nebja.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.Review;
import nebja.beans.User;
import nebja.util.NebjaUtil;

public class ReviewDAOImpl implements ReviewDAO {
static SessionFactory sf = NebjaUtil.getSessionFactory();
	@Override
	public List<Review> getAllReviews() {
			List<Review> reviews = new ArrayList<>();	
			try(Session s = sf.getCurrentSession()){
					Transaction tx = s.beginTransaction();
					reviews = s.createQuery("from Review").getResultList();
					tx.commit();
					s.close();
	
			}
			return reviews;
	}

	@Override
	public String getUserReview(int id) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			Review r = (Review) s.get(Review.class, id);
			String treview=r.getMoviereview();
			
			tx.commit();
			s.close();
			return treview;
	}
		
	}

	@Override
	public void createUserReview(Review review) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			s.persist(review);
			tx.commit();
			s.close();
		}
	}


}
