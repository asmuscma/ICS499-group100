package com.group100.VotingApp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Issue;

@Repository
public interface IssueRepository extends JpaRepository<List<Issue>, Long> {

}
