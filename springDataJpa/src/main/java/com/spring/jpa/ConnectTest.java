package com.spring.jpa;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test?user=root&password=123456";
			java.sql.Connection con = DriverManager.getConnection(url);
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
