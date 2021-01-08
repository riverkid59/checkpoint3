package com.example.checkpoint3Joss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.checkpoint3Joss.entity.User;
import com.example.checkpoint3Joss.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
}
