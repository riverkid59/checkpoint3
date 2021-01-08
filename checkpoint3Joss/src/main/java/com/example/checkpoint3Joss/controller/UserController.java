package com.example.checkpoint3Joss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.checkpoint3Joss.entity.User;




@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev/users")
@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	UserController UserService;
	
	@RequestMapping(path = "api/post", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return UserService.getAllUser();
	}
	
	/**@GetMapping("/users")
	public List<User> getAllUser(){
		return UserService.getAllUser();
	}**/
}
