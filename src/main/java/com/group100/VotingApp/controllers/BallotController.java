package com.group100.VotingApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.entity.BallotCreationDto;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.serviceImp.BallotServiceImp;

@RestController
@RequestMapping("/ballots")
public class BallotController {

	@Autowired
	private BallotRepository ballotRepo;

	@Autowired
	private BallotServiceImp ballotService;

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
		if (!ballotService.checkIfVoted(ballot.getUser().getUsername())) {
			return ballotRepo.saveAndFlush(ballot);
		}
		return null;
	}

	@GetMapping("/makeballot00")
	public String ballot00(Model model) {
		BallotCreationDto ballotsForm = new BallotCreationDto();

		// TODO: set the range to number of ballot questions
		for (int i = 0; i <= 3; i++) {
			ballotsForm.addBallot(new Ballot());
		}
		model.addAttribute("form", ballotsForm);
		return "ballot00";
	}

	@PostMapping("/makeballot00")
	public String sendballot00(@Valid @ModelAttribute BallotCreationDto form, Model model) {
		ballotService.saveAll(form.getBallots());
		model.addAttribute("ballots", ballotService.findAll());
		return "ballot01";
	}

	@GetMapping("/makeballot01")
	public String ballot01(Model model) {
		BallotCreationDto ballotsForm = new BallotCreationDto();

		// TODO: set the range to number of ballot questions
		for (int i = 0; i <= 3; i++) {
			ballotsForm.addBallot(new Ballot());
		}
		model.addAttribute("form", ballotsForm);
		return "ballot01";
	}

	@PostMapping("/makeballot01")
	public String sendballot01(@Valid @ModelAttribute BallotCreationDto form, Model model) {
		ballotService.saveAll(form.getBallots());
		model.addAttribute("ballots", ballotService.findAll());
		return "ballot02";
	}

	@GetMapping("/makeballot02")
	public String ballot02(Model model) {
		BallotCreationDto ballotsForm = new BallotCreationDto();

		// TODO: set the range to number of ballot questions
		for (int i = 0; i <= 3; i++) {
			ballotsForm.addBallot(new Ballot());
		}
		model.addAttribute("form", ballotsForm);
		return "ballot02";
	}

	@PostMapping("/makeballot02")
	public String sendballot02(@Valid @ModelAttribute BallotCreationDto form, Model model) {
		ballotService.saveAll(form.getBallots());
		model.addAttribute("ballots", ballotService.findAll());
		return "ballot03";
	}

	@GetMapping("/makeballot03")
	public String ballot03(Model model) {
		BallotCreationDto ballotsForm = new BallotCreationDto();

		// TODO: set the range to number of ballot questions
		for (int i = 0; i <= 3; i++) {
			ballotsForm.addBallot(new Ballot());
		}
		model.addAttribute("form", ballotsForm);
		return "ballot03";
	}

	@PostMapping("/makeballot03")
	public String sendballot03(@Valid @ModelAttribute BallotCreationDto form, Model model) {
		ballotService.saveAll(form.getBallots());
		model.addAttribute("ballots", ballotService.findAll());
		return "ballot04";
	}
}
