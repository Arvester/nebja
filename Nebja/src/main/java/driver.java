import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.User;
import nebja.dao.UserDAO;
import nebja.dao.UserDAOImpl;
import nebja.util.NebjaUtil;

public class driver {
static SessionFactory sf = NebjaUtil.getSessionFactory();
	public static void main(String args[]) {
		UserDAO u = new UserDAOImpl();
		u.updateprofileInfo("Fuck Bitches Make Money All Day!", 1);

}
}