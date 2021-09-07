package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;

import springbook.user.domain.User;

public class UserDao {
	DataSource dataSource;
	
	public void add(User user) throws SQLException {
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		ps.close();
		c.close();
	}
	
	public User get(String id) throws SQLException {
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		User user = null;
		if (rs.next()) {
			user = new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		
		rs.close();
		ps.close();
		c.close();
		
		if (user == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return user;
	}
	
	public int deleteAll() throws SQLException {
		int result = 0;
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("DELETE FROM users");
		result = ps.executeUpdate();
		
		ps.close();
		c.close();
		return result;
	}
	
	public int getCount() throws SQLException {
		int result = 0;
		Connection c = dataSource.getConnection();
		
		PreparedStatement ps = c.prepareStatement("SELECT count(*) FROM users");
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		result = rs.getInt(1);
		
		rs.close();
		ps.close();
		c.close();
		
		return result;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
