package com.group100.VotingApp.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Survey;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long> {

}
