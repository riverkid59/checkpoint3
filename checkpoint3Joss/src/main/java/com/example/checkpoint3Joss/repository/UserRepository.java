package com.example.checkpoint3Joss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.checkpoint3Joss.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
