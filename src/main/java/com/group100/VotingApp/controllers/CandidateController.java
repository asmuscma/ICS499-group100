package com.group100.VotingApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group100.VotingApp.data.entity.Candidate;

import com.group100.VotingApp.data.repository.CandidateRepository;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired 
	private CandidateRepository candidateRepo;
	
	@GetMapping("/all")
	public List<Candidate> list(){
		return candidateRepo.findAll();
	}
	
	public Candidate get(@PathVariable Long id) {
		return candidateRepo.getOne(id);
	}
	
	@PostMapping
	public Candidate create(@RequestBody final Candidate candidate) {
		return candidateRepo.saveAndFlush(candidate);
		}
}
