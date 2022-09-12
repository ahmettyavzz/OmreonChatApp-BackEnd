package com.deneme.chatApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deneme.chatApp.model.User;

/**
 * This is the class that connects to the database using jpa
 * @author ahmet yavuz
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
  Optional<User> findByUsername(String username);
  
  User findById(int id);
  
}

