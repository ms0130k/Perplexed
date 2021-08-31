package test;

import java.sql.SQLException;

import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class SimpleTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DaoFactory daoFactory = new DaoFactory();
		UserDao dao = daoFactory.userDao();
		dao.deleteAll();
		User user = new User();
		user.setId("id");
		user.setName("name");
		user.setPassword("password");
		
		dao.add(user);
		System.out.println(dao.get("id"));
	}
}
