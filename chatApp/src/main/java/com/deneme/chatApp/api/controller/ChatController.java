package com.deneme.chatApp.api.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.deneme.chatApp.model.Message;

/**
 * 
 * The controller class where the web socket's api requests are send.
 * @author ahmet yavuz
 *
 */
@Controller
public class ChatController {

	
	@MessageMapping("/chat")    
	@SendTo("/chatroom")   
	public Message receivePublicMessage(@Payload Message message) {
		return message;
	}
	
}
