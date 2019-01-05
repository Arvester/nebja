package nebja.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.Comment;
import nebja.beans.User;
import nebja.util.NebjaUtil;

public class CommentDAOImpl implements CommentDAO {
static SessionFactory sf = NebjaUtil.getSessionFactory();
	@Override
	public List<Comment> getAllComments() {
		List<Comment> comments = new ArrayList<>();	
		try(Session s = sf.getCurrentSession()){
				Transaction tx = s.beginTransaction();
				comments = s.createQuery("from Comment").getResultList();
				tx.commit();
				s.close();	
				return comments;
		}
	
	}

	@Override
	public List<Comment> getAllCommentsbyID(int id) {
		
		return null;
	}

	@Override
	public void makeAComment(Comment comment) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			s.persist(comment);
			tx.commit();
			s.close();
		}
		}
	}


