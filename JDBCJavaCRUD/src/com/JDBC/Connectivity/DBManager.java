package com.JDBC.Connectivity;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



// Simple JDBC connection using mySQL DB 
public class DBManager {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/testDB";
	private String uid = "root";
	private String password = "";
	
	public void selectRecord() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uid, password);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM Student");
			
			while(result.next()) {
				System.out.println("Id - > " + result.getInt(1));
				System.out.println("StudentName - > " + result.getString(2));
				System.out.println("StudentDept - > " + result.getString(3));
				System.out.println("StudentMarks - > " + result.getInt(4));
				System.out.println("*************");
			
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean recordManupulation(String query) {
		boolean flag = false;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uid, password);
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true : false;
			con.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}

}
