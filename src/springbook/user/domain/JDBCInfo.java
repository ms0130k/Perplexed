package springbook.user.domain;

public enum JDBCInfo {

//	Class.forName("com.mysql.cj.jdbc.Driver");
//	return DriverManager.getConnection("jdbc:mysql://34.64.107.165/shock_spring_db?useSSL=true", "shock_user", "1205cnlcla@@");
	DRIVER_CLASS("com.mysql.cj.jdbc.Driver"),
	URL("jdbc:mysql://34.64.107.165/shock_spring_db?useSSL=true"),
	USERNAME("shock_user"),
	PASSWORD("1205cnlcla@@");
	
	private String value;
	private JDBCInfo(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}