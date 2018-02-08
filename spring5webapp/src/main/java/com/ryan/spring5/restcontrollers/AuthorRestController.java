package com.ryan.spring5.restcontrollers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.spring5.model.Author;
import com.ryan.spring5.services.AuthorService;

@RestController
public class AuthorRestController {

	private AuthorService authorService;
	
	public AuthorRestController(AuthorService authorService) {
		this.authorService = authorService;
	}

	@RequestMapping("/authors")
	public List<Author> getAuthors() {
		return authorService.getAllAuthors();
	}
}
