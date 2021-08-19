package test;

import springbook.user.dao.NUserDao;
import springbook.user.domain.User;

public class SimpleTest {

	public static void main(String[] args) throws Exception {
		NUserDao nDao = new NUserDao();
		User user = new User();
		user.setId("id4");
		user.setName("이름");
		user.setPassword("비번");
		nDao.add(user);
		User user2 = nDao.get(user.getId());
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		
		
		
		
	}
}
