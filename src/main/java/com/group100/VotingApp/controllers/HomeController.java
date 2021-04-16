package com.group100.VotingApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView();
		view.setViewName("candidate");
	    return view;
	}
}