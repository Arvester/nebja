import java.io.File;

import org.hibernate.SessionFactory;

import nebja.dao.UserDAO;
import nebja.dao.UserDAOImpl;
import nebja.util.NebjaUtil;

public class driver {
static SessionFactory sf = NebjaUtil.getSessionFactory();
	public static void main(String args[]) {
		UserDAO u = new UserDAOImpl();
		String imageURL= "C:\\Users\\dukem\\Documents\\Blackops.jpg";
		u.updateProfilePhoto(new File(imageURL), 2);
	//	ReviewDAO r = new ReviewDAOImpl();
	//r.createUserReview(new Review("Dude,Where's My Car was friggin hilarious!",8));
}
}