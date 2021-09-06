package springbook.user.dao;

import java.sql.Driver;

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
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		dataSource.setUrl(JDBCInfo.URL.getValue());
		dataSource.setUsername(JDBCInfo.USERNAME.getValue());
		dataSource.setPassword(JDBCInfo.PASSWORD.getValue());
		return dataSource;
	}
}
