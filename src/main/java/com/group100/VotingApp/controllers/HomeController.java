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
	
	/*@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	} */
	
	@RequestMapping("/ballot")
	public ModelAndView ballot() {
		ModelAndView model = new ModelAndView();
		model.setViewName("ballot");
		return model;
	}
	@RequestMapping("/survey0")
	public ModelAndView survey0() {
		ModelAndView model = new ModelAndView();
		model.setViewName("survey0");
		return model;
	}
	
	@RequestMapping("/survey1")
	public ModelAndView survey1() {
		ModelAndView model = new ModelAndView();
		model.setViewName("survey1");
		return model;
	}
	
	@RequestMapping("/user")
	public String user() {
		return "user";
	}
}