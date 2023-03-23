package com.registration.app.createaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.app.createaccount.entity.User;
import com.registration.app.createaccount.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String register(Model model) {
        User user=new User();
        model.addAttribute("user", user);
		return "register";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
	//	if(user.getPassword().toString()==user.getCpassword().toString()) {
		String result="registeragain";
		if(user.getPassword().equals(user.getCpassword()) && service.checkUserExists(user.getEmail())) {
			try {
				service.saveUser(user);
				result="home";
			}
			catch(Exception e) {
				result="registeragain";
			}
		}
		return result;
		
		
	}
}
