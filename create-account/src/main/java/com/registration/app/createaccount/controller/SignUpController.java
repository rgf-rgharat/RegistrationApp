package com.registration.app.createaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.registration.app.createaccount.entity.User;
import com.registration.app.createaccount.service.CustomUserDetailsService;
import com.registration.app.createaccount.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	private UserService service;
	@Autowired
	private CustomUserDetailsService cservice;

	@PostMapping("SignUp")
	public User saveUser(@RequestBody User user) throws Exception {
		if(cservice.checkUserExists(user.getEmail())) {
			throw new Exception("User with "+user.getEmail()+" is already exist");
		}else {return service.saveUser(user);}
	}
	
}
