package com.deneme.chatApp.auth;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deneme.chatApp.model.User;
import com.deneme.chatApp.repository.UserRepository;

/**
 * Passes the user information retrieved from the database to the class that implements UserDetails.
 * @author ahmet yavuz
 *
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Optional<User> user=userRepository.findByUsername(username);
        
    return  user.map(CustomUserDetails::new).get();
    }
}