package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/shock_spring?useSSL=false", "shock_spring", "alstjrdl22#");
		return c;
	}

}
