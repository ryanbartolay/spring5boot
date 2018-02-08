package com.ryan.spring5.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ryan.spring5.model.Author;
import com.ryan.spring5.model.Book;
import com.ryan.spring5.model.Publisher;
import com.ryan.spring5.repositories.AuthorRepository;
import com.ryan.spring5.repositories.BookRepository;
import com.ryan.spring5.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	private void initData() {
		Publisher p1 = new Publisher("DreamWorks", "Hollywood, CA");
		Publisher p2 = new Publisher("The Wicked Brothers", "Vancouver, Canada");
		
		publisherRepository.save(p1);
		publisherRepository.save(p2);
		
		Author marioPuzo = new Author("Mario", "Puzo");
		Book b1 = new Book("The Godfather", "IS-10203", p1);
		marioPuzo.getBooks().add(b1);
		b1.getAuthors().add(marioPuzo);
		
		authorRepository.save(marioPuzo);
		bookRepository.save(b1);
		
		Author johnGrisham = new Author("John", "Grisham");
		Book b2 = new Book("The Firm", "IA-3341z", p2);
		johnGrisham.getBooks().add(b2);
		
		authorRepository.save(johnGrisham);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "JSR-23444", p2);
		rod.getBooks().add(noEJB);
		
		authorRepository.save(rod);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
}
