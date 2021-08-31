package test;

import java.sql.SQLException;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DaoFactory factory = new DaoFactory();
		UserDao dao = factory.userDao();
		dao.deleteAll();
		User user = new User();
		user.setId("아이디");
		user.setName("이름");
		user.setPassword("비밀번호");
		dao.add(user);
		System.out.println(dao.get("아이디"));
	}
}
