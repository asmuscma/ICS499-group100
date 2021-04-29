package com.group100.VotingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
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

	/*
	 * @RequestMapping("/login") public ModelAndView login() { ModelAndView model =
	 * new ModelAndView(); model.setViewName("login"); return model; }
	 */

	@RequestMapping("/ballot00")
	public String ballot() {
		return "ballot00";
	}

	@RequestMapping("/survey0")
	public String survey0() {
		return "survey0";
	}

	@RequestMapping("/survey1")
	public String survey1() {
		return "survey1";
	}

	@RequestMapping("/result")
	public String result() {
		return "result";
	}

	@RequestMapping("/enumForm")
	public String enumForm() {
		return "enumForm";
	}

	@RequestMapping("/user")
	public String user() {
		return "user";
	}
}