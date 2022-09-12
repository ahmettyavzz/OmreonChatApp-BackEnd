package com.deneme.chatApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * It is the class where I made the web socket configuration.
 * @author ahmet yavuz
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer{

	
	
	 //Transfers the message from the clients to the server(Request Channel)	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
	
			registry.addEndpoint("/chat").setAllowedOriginPatterns("*").withSockJS();
	}						
					
	
	 //Transfers the message from the server to the clients (Response Channel)
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
			registry.enableSimpleBroker("/chatroom"); //-   
}				
}
