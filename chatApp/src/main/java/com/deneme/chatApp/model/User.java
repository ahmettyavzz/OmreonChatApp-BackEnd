package com.deneme.chatApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User model class
 * @author ahmet yavuz
 *
 */
@Entity
@Table(name="user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
    private int id;
    
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	
    public User(int id, String username, String password ) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		
	
	}

	public User() {
		super();
	}


	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


	

}