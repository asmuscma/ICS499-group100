package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Survey;

import com.group100.VotingApp.data.repository.SurveyRepository;


@RestController
@RequestMapping("/survey")
public class SurveyController {

	@Autowired 
	private SurveyRepository SurveyRepo;
	
	@GetMapping("/all")
	public List<Survey> list(){
		return SurveyRepo.findAll();
	}
	
	public Survey get(@PathVariable Long id) {
		return SurveyRepo.getOne(id);
	}
	
	@PostMapping
	public Survey create(@RequestBody final Survey survey) {
		return SurveyRepo.saveAndFlush(survey);
		}
}
