package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
//		UserDao dao = context.getBean("userDao", UserDao.class);
//		dao = (UserDao) context.getBean("userDao");
//		dao.deleteAll();
//		User user = new User();
//		user.setId("아이디");
//		user.setName("이름");
//		user.setPassword("비밀번호");
//		dao.add(user);
//		System.out.println(dao.get("아이디"));
		
		DaoFactory factory = new DaoFactory();
		UserDao dao1 = factory.userDao();
		UserDao dao2 = factory.userDao();
		System.out.println(dao1 == dao2);
		System.out.println(dao1.equals(dao2));
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		dao1 = context.getBean("userDao", UserDao.class);
		dao2 = context.getBean("userDao", UserDao.class);
		System.out.println(dao1 == dao2);
		System.out.println(dao1.equals(dao2));
		
		dao1 = (UserDao) context.getBean("userDao");
		dao2 = (UserDao) context.getBean("userDao");
		System.out.println(dao1 == dao2);
		System.out.println(dao1.equals(dao2));
		System.out.println("====");
		System.out.println(new String("Str") == new String("Str"));
		System.out.println(new String("Str").equals(new String("Str")));
		
		
	}
}
