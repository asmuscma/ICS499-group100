package com.group100.VotingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/login?error=true")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
