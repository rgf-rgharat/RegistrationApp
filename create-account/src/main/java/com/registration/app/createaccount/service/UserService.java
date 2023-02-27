package com.registration.app.createaccount.service;

import com.registration.app.createaccount.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public boolean checkUserExists(String email);
}
