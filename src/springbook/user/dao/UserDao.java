package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import springbook.user.domain.User;

public class UserDao {

	public void add(User user) throws ClassNotFoundException, SQLException {
		/*
		 * DB 연결을 위한 Connection을 가져온다.
		 * SQL을 담은 Statement(또는 PreparedStatement)를 만든다.
		 * 만들어진 Statement를 실행한다.
		 * 조회의 경우 SQL 쿼리의 실행 결과를 ResultSet으로 받아서 정보를 저장할 오브젝트에 옮겨준다.
		 * 작업 중에 생성된 Connection, Statement, ResultSet 같은 리소스는 작업을 마친 후 반드시 닫아준다.
		 * JDBC API가 만들어내느 예외를 잡아서 직접 처리하거나, 메소드에 throws를 선언해서 예외 발생시 메소드 밖으로 던지게 한다.
		 */
		Class.forName("com.mysql.jdbc.Drive");
		Connection c = DriverManager.getConnection("jdbc:mysql://34.64.107.165/shock_spring_db", "shock_user", "1205cnlcla@@");
		PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		ps.close();
		c.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Drive");
		Connection c = DriverManager.getConnection("jdbc:mysql://34.64.107.165/shock_spring_db", "shock_user", "1205cnlcla@@");
		PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
	}
}
