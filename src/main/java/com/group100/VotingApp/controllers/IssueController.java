package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Issue;
import com.group100.VotingApp.data.repository.IssueRepository;

@RestController
@RequestMapping("/issues")
public class IssueController {

	@Autowired
	private IssueRepository issueRepo;

	@GetMapping("/all")
	public List<Issue> list() {
		return issueRepo.findAll();
	}

	@GetMapping("/issue/{id}")
	public Issue get(@PathVariable Long id) {
		return issueRepo.getOne(id);
	}

	@PostMapping("/add")
	public Issue create(@RequestBody final Issue issue) {
		return issueRepo.saveAndFlush(issue);
	}
}
