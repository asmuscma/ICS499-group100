package com.group100.VotingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@RequestMapping("/")
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("about");
	    return modelAndView;
	}
	@RequestMapping("/candidate")
	public ModelAndView candidate() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("candidate");
	    return modelAndView;
	}
}