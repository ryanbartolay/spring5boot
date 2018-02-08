package com.ryan.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ryan.spring5.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
