package com.sylviadang.traveljournal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sylviadang.traveljournal.models.Post;
import com.sylviadang.traveljournal.services.PostService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	
	@GetMapping("/create")
	public String createPost(@ModelAttribute("post") Post post) {
		return "post/create.jsp";
	}
	
	@PostMapping("")
	public String processNewPost(@Valid @ModelAttribute("post") Post post, BindingResult result) {
		if(result.hasErrors()) {
			return "post/create.jsp";
		}
		postService.create(post);
		return "redirect:/";
	}

}
