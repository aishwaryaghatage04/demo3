package com.post1.demo3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post1.demo3.entities.Post;
import com.post1.demo3.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService {

	@Autowired
	PostRepository repo;

	@Override
	public void createPost(Post post) {
	 
		repo.save(post);
		
	}

	@Override
	public List<Post> fetchAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
