package com.ltts.productionproject.configure;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfigure {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/dpsjava","root","Abhishek@123");
		return c;
}
}
