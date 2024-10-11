package com.posts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posts.entities.Post;
import com.posts.repositories.PostRepository;


@Service
public class PostServiceImplementation 
               implements PostService{
	
	
	@Autowired
	PostRepository repo;

	public void createPost(Post post) {
		repo.save(post);
	}

	@Override
	public List<Post> fetchAllPosts() {
		return repo.findAll();
	}

	@Override
	public Post getPost(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void updatePost(Post post) {
		repo.save(post);
	}
	
	

}
