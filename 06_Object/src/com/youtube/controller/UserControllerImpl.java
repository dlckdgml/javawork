package com.youtube.controller;
import com.youtube.model.User;
public class UserControllerImpl {

	public class UserController {
		
	User user = null;
	
	public boolean login(String id, String password) {
		if(user!=null && user.getId().equals(id)
				  && user.getpassword().equals(password));
		return true;
		
		
	}
    
	}
}
