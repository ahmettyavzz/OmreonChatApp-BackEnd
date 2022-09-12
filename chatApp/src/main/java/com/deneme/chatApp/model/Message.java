package com.deneme.chatApp.model;

/**
 * 
 * message model class
 *@author ahmet yavuz
 */

public class Message {
	
	
		private String senderName;
		private String message;
	
		
		
		public Message() {
			super();
		}
		
		public Message(String senderName,  String message) {
			super();
			this.senderName = senderName;
			this.message = message;
			
		}
		
		
		public String getSenderName() {
			return senderName;
		}
		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	
		
}
