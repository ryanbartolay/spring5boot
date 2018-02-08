package com.ryan.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ryan.spring5.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
