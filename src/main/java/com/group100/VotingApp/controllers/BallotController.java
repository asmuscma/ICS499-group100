package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.repository.BallotRepository;

@RestController
@RequestMapping("/ballots")
public class BallotController {

	@Autowired
	private BallotRepository ballotRepo;

	@GetMapping("/all")
	public List<Ballot> list() {
		return ballotRepo.findAll();
	}

	@GetMapping("/issue/{id}")
	public Ballot get(@PathVariable Long id) {
		return ballotRepo.getOne(id);
	}

	@PostMapping("/add")
	public Ballot create(@RequestBody final Ballot ballot) {
		return ballotRepo.saveAndFlush(ballot);
	}
}