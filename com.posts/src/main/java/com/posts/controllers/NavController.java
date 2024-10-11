package com.posts.controllers;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class NavController {
	@GetMapping("/")
	public String newPost() {
		return "newPost";
	}
	

}
