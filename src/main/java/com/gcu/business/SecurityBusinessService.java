package com.gcu.business;

import org.springframework.stereotype.*;

@Service
public class SecurityBusinessService {

	public boolean authenticate(String username, String password) {
		System.out.print("Hello from the SecurityBusinessService");
		return true; 
	}
	
}
