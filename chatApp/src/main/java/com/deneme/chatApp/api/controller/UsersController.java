package com.deneme.chatApp.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.deneme.chatApp.business.abstracts.UserService;
import com.deneme.chatApp.model.User;

/**
 * 
 * The controller class where the user api requests are send.
 * @author ahmet yavuz
 *
 */
@RestController
@CrossOrigin
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/register")
	public boolean saveUser( User user) {
		userService.saveUser(user);
		return true;
	}
	
	

	
	
	
}
