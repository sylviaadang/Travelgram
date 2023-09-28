package com.sylviadang.traveljournal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sylviadang.traveljournal.services.PostService;
import com.sylviadang.traveljournal.services.UserService;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("profile")
public class ProfileController {
	
	@Autowired
	private UserService userService;
	@Autowired 
	private PostService postService;
	
	@GetMapping("")
	public String profilePage(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		model.addAttribute("allPosts", postService.getAll());
		model.addAttribute("loginUser", userService.getUser((Long) session.getAttribute("user_id")));
			return "post/myProfile.jsp";
		
	}
	
//	@GetMapping("/edit")
//	public String editBio(@ModelAttribute("bio") Bio bio) {
//		model.addAttribute("bio", bioService.getOne(id))
//		return "post/editBio.jsp";
//	}
//	
//	@PatchMapping("/edit")
//	public 
	
	
	
}
