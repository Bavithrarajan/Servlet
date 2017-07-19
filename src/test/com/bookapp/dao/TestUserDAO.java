package test.com.bookapp.dao;

import com.bookapp.dao.UserDAO;
import com.bookapp.model.User;

public class TestUserDAO {
public static void main(String[]args){
	User user = new User();
user.setName("shylu");
user.setEmailId("shylu2@gmail.com");	
user.setPassword("pass123");
UserDAO dao = new UserDAO();
dao.register(user);
User userObj = dao.login(user);
 System.out.println(user);
}
}

