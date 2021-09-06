package springbook.user.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import springbook.user.domain.JDBCInfo;

@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao(dataSource());
		return userDao;
	}
//	@Bean
//	public ConnectionMaker connectionMaker() {
//		return new CountingConnectionMaker(realConnectionMaker());
//	}
//	@Bean
//	public ConnectionMaker realConnectionMaker() {
//		return new DConnectionMaker();
//	}
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new SimpleDriverDataSource(Class.forName(JDBCInfo.DRIVER_CLASS.getValue()), JDBCInfo.URL.getValue(), JDBCInfo.USERNAME.getValue(), JDBCInfo.PASSWORD.getValue());
		return dataSource;
	}
}
