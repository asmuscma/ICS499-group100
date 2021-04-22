package com.group100.VotingApp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.serviceImp.UserServiceImp;

@Controller
public class RegistrationController {

	@Autowired
	private UserServiceImp userService;
	
	@GetMapping({ "/register" })
	public String getRegister(@ModelAttribute("User") User registeredUser) {
		return "Registration";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("User") User user, BindingResult result, Model model) {
		// save to DB
		userService.register(user);

		if (result.hasErrors()) {
			return "/register";
		}
		model.addAttribute(user);
		return "/login";
	}

}
