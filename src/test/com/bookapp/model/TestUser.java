package test.com.bookapp.model;

import com.bookapp.model.User;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user = new User();
user.setId(1);
user.setName("bavithra");
user.setEmailId("bavithra@gmail.com");
user.setPassword("pass123");
System.out.println(user);
	}

}
