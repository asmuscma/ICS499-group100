package com.group100.VotingApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Survey;
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
	@GetMapping("/survey0")
	public String addsurvey0(Model model) {
		return "survey0";
	}

	@PostMapping("/survey0")
	public String savesurvey0(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey01";
	}

	@GetMapping("/survey1")
	public String addsurvey1(Model model) {
		return "survey01";
	}

	@PostMapping("/survey1")
	public String savesurvey1(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey02";
	}

	@GetMapping("/survey2")
	public String addsurvey2(Model model) {
		return "survey02";
	}

	@PostMapping("/survey2")
	public String savesurvey2(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey03";
	}

	@GetMapping("/survey3")
	public String addsurvey3(Model model) {
		return "survey03";
	}

	@PostMapping("/survey3")
	public String savesurvey3(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey04";
	}

	@GetMapping("/survey4")
	public String addsurvey4(Model model) {
		return "survey04";
	}

	@PostMapping("/survey4")
	public String savesurvey4(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey05";
	}

	@GetMapping("/survey5")
	public String addsurvey5(Model model) {
		return "survey05";
	}

	@PostMapping("/survey5")
	public String savesurvey5(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey06";
	}

	@GetMapping("/survey6")
	public String addsurvey6(Model model) {
		return "survey06";
	}

	@PostMapping("/survey6")
	public String savesurvey6(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey07";
	}

	@GetMapping("/survey7")
	public String addsurvey7(Model model) {
		return "survey07";
	}

	@PostMapping("/survey7")
	public String savesurvey7(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey08";
	}

	@GetMapping("/survey8")
	public String addsurvey8(Model model) {
		return "survey08";
	}

	@PostMapping("/survey8")
	public String savesurvey8(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey9";
	}

	@GetMapping("/survey9")
	public String addsurvey9(Model model) {
		return "survey9";
	}

	@PostMapping("/survey9")
	public String savesurvey9(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey10";
	}

	@GetMapping("/survey10")
	public String addsurvey10(Model model) {
		return "survey10";
	}

	@PostMapping("/survey10")
	public String savesurvey10(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey11";
	}

	@GetMapping("/survey11")
	public String addsurvey11(Model model) {
		return "survey11";
	}

	@PostMapping("/survey11")
	public String savesurvey11(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey12";
	}

	@GetMapping("/survey12")
	public String addsurvey12(Model model) {
		return "survey12";
	}

	@PostMapping("/survey12")
	public String savesurvey12(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey13";
	}

	@GetMapping("/survey13")
	public String addsurvey13(Model model) {
		return "survey13";
	}

	@PostMapping("/survey13")
	public String savesurvey13(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey14";
	}

	@GetMapping("/survey14")
	public String addsurvey14(Model model) {
		return "survey14";
	}

	@PostMapping("/survey14")
	public String savesurvey14(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey15";
	}

	@GetMapping("/survey15")
	public String addsurvey15(Model model) {
		return "survey15";
	}

	@PostMapping("/survey15")
	public String savesurvey15(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey16";
	}

	@GetMapping("/survey16")
	public String addsurvey16(Model model) {
		return "survey16";
	}

	@PostMapping("/survey16")
	public String savesurvey16(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey17";
	}

	@GetMapping("/survey17")
	public String addsurvey17(Model model) {
		return "survey17";
	}

	@PostMapping("/survey17")
	public String savesurvey17(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey18";
	}

	@GetMapping("/survey18")
	public String addsurvey18(Model model) {
		return "survey18";
	}

	@PostMapping("/survey18")
	public String savesurvey18(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey19";
	}

	@GetMapping("/survey19")
	public String addsurvey19(Model model) {
		return "survey19";
	}

	@PostMapping("/survey19")
	public String savesurvey19(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey20";
	}

	@GetMapping("/survey20")
	public String addsurvey20(Model model) {
		return "survey20";
	}

	@PostMapping("/survey20")
	public String savesurvey20(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "survey21";
	}

	@GetMapping("/survey21")
	public String addsurvey21(Model model) {
		return "survey21";
	}

	@PostMapping("/survey21")
	public String savesurvey21(@Valid Survey survey, Model model) {
		surveyRepo.saveAndFlush(survey);
		model.addAttribute("survey", survey);
		return "result";
	}

}
