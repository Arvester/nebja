package nebja.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.BlobProxy;

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
	public void updateProfilePhoto(File photo, int id) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			User u = (User) s.get(User.class, id);
			byte[] imageInBytes = new byte[(int)photo.length()]; //image convert in byte form
			FileInputStream inputStream = new FileInputStream(photo);  //input stream object create to read the file
			inputStream.read(imageInBytes); // here inputstream object read the file
			inputStream.close();
			u.setPicture(imageInBytes);
			tx.commit();
			s.close();
		}
		 catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public File getPhoto(int id) {
		File image = null;
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			User u = (User) s.get(User.class, id);
		File imageFile = new File("myImage.jpg"); // we can put any name of file (just name of new file created).
		byte[] getImageInBytes = u.getPicture();
		if (u.getPicture()==null) {
			imageFile = null;
			return imageFile;
		}
		FileOutputStream outputStream = new FileOutputStream(imageFile); // it will create new file (same location of class)
		outputStream.write(getImageInBytes); // image write in "myImage.jpg" file
		outputStream.close(); // close the output stream
		s.close();
		
		return imageFile;
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return image;
		
	}
}

