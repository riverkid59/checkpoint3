package com.example.checkpoint3Joss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.checkpoint3Joss.entity.Post;


@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev/posts")
@RestController
@RequestMapping("/feed")

public class PostController {

	@Autowired
	PostController PostService;
	
	@RequestMapping(path = "api/post", method = RequestMethod.GET)
	public List<Post> getAllPost() {
		return PostService.getAllPost();
	}
	
	/**@GetMapping("/users")
	public List<Post> indexSeller(){
		return UserService.getAllPost();
	}**/
}
