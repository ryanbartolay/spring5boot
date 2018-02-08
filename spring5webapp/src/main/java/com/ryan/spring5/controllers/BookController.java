package com.ryan.spring5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryan.spring5.services.BookService;

@Controller
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String getAllBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "books";
	}
}
