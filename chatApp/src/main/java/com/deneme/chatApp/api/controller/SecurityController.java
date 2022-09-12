package com.deneme.chatApp.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 
 * The controller class where the spring security's api requests are send.
 * @author ahmet yavuz
 *
 */
@RestController
@CrossOrigin
public class SecurityController {

	
	@RequestMapping("/gotochat")
	public RedirectView localRedirect() {
	    RedirectView redirectView = new RedirectView();
	    redirectView.setUrl("http://localhost:3000/chat");
	    return redirectView;
	}
	

   
}