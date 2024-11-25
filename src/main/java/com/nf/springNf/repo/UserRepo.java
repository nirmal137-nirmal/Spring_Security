package com.nf.springNf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nf.springNf.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	
	Users findByUsername(String username);
}
