package com.group100.VotingApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.serviceImp.UserServiceImp;

import jakarta.validation.Valid;

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
	public String getRegister(@ModelAttribute("user") User user) {
		return "/Registration";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
		// save to DB 
		
		if(result.hasErrors())
		{
			return "/Registration";
		}
		userService.register(user);
		model.addAttribute("user", new User());
	
		return "/login";
	}

}
