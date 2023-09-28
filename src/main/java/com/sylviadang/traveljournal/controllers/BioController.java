package com.sylviadang.traveljournal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sylviadang.traveljournal.models.Bio;
import com.sylviadang.traveljournal.services.BioService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/bio")
public class BioController {
	
	@Autowired
	private BioService bioService;

	@GetMapping("/create")
	public String createBio(@ModelAttribute("bio") Bio bio) {
		return "post/createBio.jsp";
	}
	
	@PostMapping("")
	public String processNewBio(@Valid @ModelAttribute("bio") Bio bio, BindingResult result) {
		if (result.hasErrors()) {
			return "post/createBio.jsp";
		}
		bioService.create(bio);
		return "redirect:/";
	}
}
