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

import com.group100.VotingApp.data.entity.Issue;
import com.group100.VotingApp.data.repository.IssueRepository;
import com.group100.VotingApp.serviceImp.IssueServiceImp;

@Controller
public class IssueController {

	@Autowired
	private IssueRepository issueRepo;

	@Autowired
	private IssueServiceImp issueServiceImp;

	@GetMapping("/all")
	public List<Issue> list() {
		return issueRepo.findAll();
	}

	@GetMapping("/survey/{id}")
	public Issue get(@PathVariable Long id) {
		return issueRepo.getOne(id);
	}

	@PostMapping("/add")
	public Issue create(@RequestBody final Issue issue) {
		if (!issueServiceImp.checkIfVoted(issue.getUser())) {
			return issueRepo.saveAndFlush(issue);
		}
		return null;
	}

	/*
	 * @GetMapping("/createSurvey") public String createSurvey(Model model) {
	 * model.addAttribute("Survey", new Survey()); return "createSurvey"; }
	 */
	@GetMapping("/makesurvey0")
	public String addsurvey0(@ModelAttribute Issue issue) {
		return "survey0";
	}

	@PostMapping("/makesurvey0")
	public String savesurvey0(@Valid Issue issue, Model model) {
		model.addAttribute("issue", issue);
		return "survey1";
	}

	@GetMapping("/makesurvey1")
	public String addsurvey1(@ModelAttribute Issue issue) {
		return "survey1";
	}

	@PostMapping("/makesurvey1")
	public String savesurvey1(@Valid Issue issue, Model model) {
		model.addAttribute("issue", issue);
		return "survey2";
	}

}
