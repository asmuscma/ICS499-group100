package com.group100.VotingApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String register(final Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/register")
	public String userRegistration(User user, final Model model) {
		userService.register(user);
		return "/home";
	}
}
