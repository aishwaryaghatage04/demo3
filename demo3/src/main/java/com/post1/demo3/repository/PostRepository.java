package com.post1.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post1.demo3.entities.Post;

public interface PostRepository  extends JpaRepository<Post, Long>{

}
