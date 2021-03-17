package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group100.VotingApp.data.entity.Poll;
import com.group100.VotingApp.data.repository.PollRepository;

@RestController
@RequestMapping("/issues")
public class PollController {

	@Autowired
	private PollRepository pollRepo;

	@GetMapping("/all")
	public List<Poll> list() {
		return pollRepo.findAll();
	}

	@GetMapping("/issue/{id}")
	public Poll get(@PathVariable Long id) {
		return pollRepo.getOne(id);
	}

	@PostMapping("/add")
	public Poll create(@RequestBody final Poll poll) {
		return pollRepo.saveAndFlush(poll);
	}
}
