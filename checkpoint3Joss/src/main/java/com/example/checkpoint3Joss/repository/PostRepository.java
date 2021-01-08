package com.example.checkpoint3Joss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.checkpoint3Joss.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	
}

