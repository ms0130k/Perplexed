package test;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {
	
	public static void main(String[] args) {
		JUnitCore.main("test.UserDaoTest");
	}

	@Test
	public void addAndGet() throws SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		dao.deleteAll();
		User user = new User();
		user.setId("shock");
		user.setName("쇽쇽");
		user.setPassword("1q2w3e4r");
		dao.add(user);
		
		User user2 = dao.get("shock");
	}
}
