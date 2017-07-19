package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
public static Connection getConnection(){
Connection connection = null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
	e.printStackTrace();
}
try{
	connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapplication_db?useSSL=false","root","shylaja");
}catch(SQLException e){
	e.printStackTrace();
}
return connection;
}
}
