package com.ryan.spring5.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ryan.spring5.model.Author;
import com.ryan.spring5.model.Book;
import com.ryan.spring5.repositories.AuthorRepository;
import com.ryan.spring5.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	private void initData() {
		Author marioPuzo = new Author("Mario", "Puzo");
		Book b1 = new Book("The Godfather", "IS-10203", "Hollywood");
		marioPuzo.getBooks().add(b1);
		b1.getAuthors().add(marioPuzo);
		
		authorRepository.save(marioPuzo);
		bookRepository.save(b1);
		
		Author johnGrisham = new Author("John", "Grisham");
		Book b2 = new Book("The Firm", "IA-3341z", "The Wicked Brothers");
		johnGrisham.getBooks().add(b2);
		
		authorRepository.save(johnGrisham);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "JSR-23444", "Worx");
		rod.getBooks().add(noEJB);
		
		authorRepository.save(rod);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
}
