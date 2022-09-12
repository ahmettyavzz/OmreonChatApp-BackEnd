package com.deneme.chatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.deneme.chatApp.repository.UserRepository;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ChatAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatAppApplication.class, args);
	}
	

}
