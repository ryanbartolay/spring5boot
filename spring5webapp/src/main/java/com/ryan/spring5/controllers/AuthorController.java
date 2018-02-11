package com.ryan.spring5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryan.spring5.services.AuthorService;

@Controller
public class AuthorController {

	private AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	@RequestMapping("/authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", this.authorService.getAll());
		return "authors";
	}
}
