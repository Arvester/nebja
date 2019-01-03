package nebja.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class driver {

	public static void main(String args[]) {
		try(SessionFactory sf = NebjaUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			System.out.println(s.toString());
		}
	}
}
