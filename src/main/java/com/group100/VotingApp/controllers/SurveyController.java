package com.group100.VotingApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group100.VotingApp.data.entity.Survey;
import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.serviceImp.SurveyServiceImp;

@RestController
@RequestMapping("/surveys")
public class SurveyController {

	@Autowired
	private SurveyRepository surveyRepo;
	
	@Autowired
	private SurveyServiceImp surveyServiceImp;

	@GetMapping("/all")
	public List<Survey> list() {
		return surveyRepo.findAll();
	}

	@GetMapping("/survey/{id}")
	public Survey get(@PathVariable Long id) {
		return surveyRepo.getOne(id);
	}

	@PostMapping("/add")
	public Survey create(@RequestBody final Survey survey) {
		if(!surveyServiceImp.checkIfVoted(survey.getUser())) {
			return surveyRepo.saveAndFlush(survey);
		}
		return null;
	}
	
	@GetMapping("/createSurvey")
		public String createSurvey(Model model) {
		model.addAttribute("Survey", new Survey());
		return "createSurvey";
	}
	@GetMapping({ "/makesurvey1" })
	public String getSurvey(@ModelAttribute("survey") Survey X) {
		return "survey1";
	}
	@PostMapping("/makesurvey1")
	public String surveyForm(@Valid @ModelAttribute("survey") Survey X, BindingResult result, Model model) {
		// save to DB
		if (result.hasErrors()) {
			return "survey1";
		}
		model.addAttribute(X);
		return "/survey2";
	}
		
	
	
}
