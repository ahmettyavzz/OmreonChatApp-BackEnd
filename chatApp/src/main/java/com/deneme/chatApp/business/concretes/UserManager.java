package com.deneme.chatApp.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.deneme.chatApp.business.abstracts.UserService;
import com.deneme.chatApp.model.User;
import com.deneme.chatApp.repository.UserRepository;

	/**
	 * 
	 * It is the class where user operations are made by connecting to the data access layer.
	 * @author ahmet yavuz
	 */

@Service
public class UserManager implements UserService{

	
	private UserRepository userRepository;

	
	@Autowired
	public UserManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public boolean saveUser(User user) {
		userRepository.save(user);
		return true;
	}



}
