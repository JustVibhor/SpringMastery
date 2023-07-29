package com.justvibhor.springboot.springwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String userName, String password) {
		boolean isValidUsername = userName.equalsIgnoreCase("JustVibhor");
		boolean isValidPassword = password.equalsIgnoreCase("1234");

		return isValidUsername && isValidPassword;
	}
}
