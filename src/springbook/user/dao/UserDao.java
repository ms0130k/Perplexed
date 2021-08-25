package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import springbook.user.domain.User;

public class UserDao {

	public void add(User user) throws ClassNotFoundException, SQLException {
//		("jdbc:mysql://127.0.0.1/shock_spring?useSSL=false", "shock_spring", "alstjrdl22#");
//		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://34.64.107.165/shock_spring_db?useSSL=false", "shock_user", "1205cnlcla@@");
		System.out.println("문제 없음");
		
	}
}
