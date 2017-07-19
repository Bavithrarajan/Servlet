package test.com.bookapp.util;

import java.sql.Connection;

import com.bookapp.util.ConnectionUtil;

public class TestConnectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection connection =ConnectionUtil.getConnection();
System.out.println(connection);
	}

}
