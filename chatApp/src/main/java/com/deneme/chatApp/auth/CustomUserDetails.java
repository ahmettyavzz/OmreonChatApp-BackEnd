package com.deneme.chatApp.auth;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.deneme.chatApp.model.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Details the user information retrieved from the database
 * @author ahmet yavuz
 *
 */
public class CustomUserDetails implements UserDetails {

	private String username;
	private String password;
	
	
	
	public CustomUserDetails(User user) {
		this.username=user.getUsername();
		this.password=user.getPassword();
	
		
	}
	
	public CustomUserDetails() {}
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }





}