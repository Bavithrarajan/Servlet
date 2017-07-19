package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
public void register(User user){
Connection connection = ConnectionUtil.getConnection();


PreparedStatement pst;
try {
	pst = connection.prepareStatement("insert into users(name,email_id,password)\r\n"
	+ "values(?,?,?)");
	pst.setString(1,user.getName());
	pst.setString(2,user.getEmailId());
	pst.setString(3,user.getPassword());
	pst.executeUpdate();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public User login(User user){
Connection connection = ConnectionUtil.getConnection();
PreparedStatement pst;
User userObj = null;
try {
	pst = connection.prepareStatement("select id,name,email_id,password"+" from users"+
	" where email_id=? and password=?");
	pst.setString(1,user.getEmailId());
	pst.setString(2,user.getPassword());
	ResultSet rs = pst.executeQuery();
	if(rs.next()){
		 userObj = new User();
		userObj.setId(rs.getInt(1));
		userObj.setName(rs.getString(2));
		userObj.setEmailId(rs.getString(3));
		userObj.setPassword(rs.getString(4));
		System.out.println(userObj);
		
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return userObj;
}
}