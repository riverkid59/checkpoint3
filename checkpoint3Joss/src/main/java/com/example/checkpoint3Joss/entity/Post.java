package com.example.checkpoint3Joss.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.checkpoint3Joss.entity.Post;

@Entity
@Table(name= "Post")

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String message;
	private String imageUrl;
	
	
	public Post() {
		
	}

	public Post(String message, String imageUrl) {
		this.message = message;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setRate(String message) {
		this.message = message;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setComment(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}