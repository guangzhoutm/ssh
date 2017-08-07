package com.neusoft.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection conn;
	private Statement sta;
	
	public Database(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydb";
			conn = DriverManager.getConnection(url,"root","root");
			sta = conn.createStatement();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null;
		try {
			rs = sta.executeQuery(sql);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return rs;
	}

}
