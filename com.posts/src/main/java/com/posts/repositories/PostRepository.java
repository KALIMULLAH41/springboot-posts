package com.posts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posts.entities.Post;

public interface PostRepository 
       extends JpaRepository<Post,Long>{

}
