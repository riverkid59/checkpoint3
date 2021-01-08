package com.example.checkpoint3Joss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.checkpoint3Joss.entity.Post;
import com.example.checkpoint3Joss.repository.PostRepository;



@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;

	
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}
}
