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

	/*
	 * @GetMapping("/register") public String register(final Model model) {
	 * model.addAttribute("user", new User()); return "/Registration"; }
	 * 
	 * @PostMapping("/register") public String
	 * submitForm(@ModelAttribute("user") @Valid User user, BindingResult result) {
	 * if(result.hasErrors()){ return "/Registration"; }
	 * 
	 * userService.register(user); return "/registration"; }
	 */

	@GetMapping({ "/register" })
	public String getRegister(@ModelAttribute("User") User registeredUser) {
		return "Registration";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("User") User X, BindingResult result, Model model) {
		// save to DB
		userService.register(X);

		if (result.hasErrors()) {
			return "Registration";
		}
		model.addAttribute(X);
		return "/login";
	}

}
