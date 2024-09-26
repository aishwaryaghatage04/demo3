package com.post1.demo3.Services;

import java.util.List;

import com.post1.demo3.entities.Post;

public interface PostService {

	void createPost(Post post);
	
	List<Post> fetchAllPosts();
}

