package com.group100.VotingApp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public boolean findByUsernameAndPassword(String username, String password);
}
