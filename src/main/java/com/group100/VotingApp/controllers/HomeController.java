package com.group100.VotingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
<<<<<<< Updated upstream
	@GetMapping("/Home")
	public String home() {
	return "index";
=======
	@RequestMapping("/")
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
>>>>>>> Stashed changes
	}

	
}