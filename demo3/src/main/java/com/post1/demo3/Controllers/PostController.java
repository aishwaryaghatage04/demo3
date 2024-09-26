package com.post1.demo3.Controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.post1.demo3.Services.PostService;
import com.post1.demo3.entities.Post;

@Controller
public class PostController 
{
	@Autowired
	PostService service;
	
	@PostMapping("/createPost")
	public String createPost(@RequestParam ("caption") String caption,
			@RequestParam("photo") MultipartFile photo,
			Model model
			) {
		 Post post = new Post();
		 post.setCaption(caption);
	    try {
	    	post.setPhoto(photo.getBytes());
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
		service.createPost(post);
		model.addAttribute("post", post);
		return "post";
	}
}
