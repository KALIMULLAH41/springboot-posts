package com.posts.services;



import java.util.List;

import com.posts.entities.Post;

public interface PostService {

	void createPost(Post post);

	List<Post> fetchAllPosts();

	Post getPost(Long id);

	void updatePost(Post post);

	

}
