package springbook.user.domain;

public enum JDBCTestInfo {

	DRIVER_CLASS("com.mysql.cj.jdbc.Driver"),
	URL("jdbc:mysql://34.64.107.165/shock_spring_db_test?useSSL=true"),
	USERNAME("shock_user_test"),
	PASSWORD("1205cnlcla@@");
	
	private String value;
	private JDBCTestInfo(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}