package com.group100.VotingApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Survey;
import com.group100.VotingApp.data.entity.SurveyCreationDto;
import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.serviceImp.SurveyServiceImp;

@Controller
public class SurveyController {

	@Autowired
	private SurveyRepository surveyRepo;

	@Autowired
	private SurveyServiceImp surveyService;

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
		if (!surveyService.checkIfVoted(survey.getUser())) {
			return surveyRepo.saveAndFlush(survey);
		}
		return null;
	}

	/*
	 * @GetMapping("/createSurvey") public String createSurvey(Model model) {
	 * model.addAttribute("Survey", new Survey()); return "createSurvey"; }
	 */
	@GetMapping("/makesurvey0")
	public String addsurvey0(Model model) {
		SurveyCreationDto surveysForm = new SurveyCreationDto();
		
		for(int i = 0; i <= 24; i++) {
			surveysForm.addSurvey(new Survey());
		}
		model.addAttribute("form", surveysForm);
		return "survey0";
	}

	@PostMapping("/makesurvey0")
	public String savesurvey0(@Valid @ModelAttribute SurveyCreationDto form, Model model) {
		/*surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);*/
		surveyService.saveAll(form.getSurveys());
		model.addAttribute("surveys", surveyService.findAll());
		return "result";
	}
}
