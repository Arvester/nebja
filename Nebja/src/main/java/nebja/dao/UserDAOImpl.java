package nebja.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.User;
import nebja.util.NebjaUtil;

public class UserDAOImpl implements UserDAO {
static SessionFactory sf = NebjaUtil.getSessionFactory();


	@Override
	public List<User> getAllUsers() {
	List<User> users = new ArrayList<>();	
	
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			users = s.createQuery("from User").getResultList();
			tx.commit();
			s.close();
		}
		return users;
		
	}

	@Override
	public void createUser(User user) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			s.persist(user);
			tx.commit();
			s.close();
		}
		
	}

	@Override
	public void updateUsername(String username1,int id) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			User u = (User) s.get(User.class, id);
			u.setUsername(username1);
			s.update(u);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updatePassword(String password,int id) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			User u = (User) s.get(User.class, id);
			u.setPassword(password);
			s.update(u);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void createProfilePhoto(File photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateprofileInfo(String profileInfo,int id) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			User u = (User) s.get(User.class, id);
			u.setProfileinfo(profileInfo);
			s.update(u);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updateProfilePhoto(File photo) {
		// TODO Auto-generated method stub

	}

}
