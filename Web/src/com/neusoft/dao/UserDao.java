package com.neusoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.db.Database;

public class UserDao {
	private Database db;
	public UserDao(){
		db = new Database();
	}
	
	public boolean loginCheck(String username,String password){ 
		String sql = "select * from user where username='"+username+"' and password='"+password+"'";
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {  
			return false;
		} 
	}

}
