package com.registration.app.createaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.registration.app.createaccount.service.UserServiceImpl;

@Controller
public class SignUpController {

	@Autowired
	private UserServiceImpl service;

	@GetMapping("/")
	public String Register() {

		return "register";
	}

}
