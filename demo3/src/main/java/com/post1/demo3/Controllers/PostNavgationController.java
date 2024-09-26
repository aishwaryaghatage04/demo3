package com.post1.demo3.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostNavgationController 
{
	@GetMapping("/")
	public String newPost() {
		return "newpost";
	}
}
