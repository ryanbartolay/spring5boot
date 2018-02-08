package com.ryan.spring5.services;

import org.springframework.stereotype.Service;

import com.ryan.spring5.model.Book;
import com.ryan.spring5.repositories.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
