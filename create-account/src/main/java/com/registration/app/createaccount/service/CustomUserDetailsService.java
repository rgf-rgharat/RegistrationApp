package com.registration.app.createaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.app.createaccount.entity.User;
import com.registration.app.createaccount.repository.UserRepository;

@Service
public class CustomUserDetailsService {

	@Autowired
	private UserRepository repository;
	
	public boolean checkUserExists(String email) {
		User userfound;
		 userfound=repository.findByEmail(email);
		return userfound!=null;
	}
}
