package com.imcs.training.feb;

public class LoginService {

	
public boolean isValidUser(String userID) {
		
		if(userID!=null&& !userID.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}

	 public User getUser(String userID) {
		 
		 User user = new User();
		 user.setUserID(userID);
		 user.setFristName("Rama");
		 user.setLastName("Krishna");
		 
		 return user;
		 
		 
	 }
}
