package com.ryan.spring5.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ryan.spring5.model.Author;
import com.ryan.spring5.repositories.AuthorRepository;

@Service
public class AuthorService {
	private AuthorRepository authorRepository;

	public AuthorService(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	public List<Author> getAllAuthors() {
		List<Author> authors = new ArrayList<>();
		authorRepository.findAll().forEach(t -> authors.add(t));
		return authors;
	}
}
