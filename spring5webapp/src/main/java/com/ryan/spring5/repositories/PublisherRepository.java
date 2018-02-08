package com.ryan.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ryan.spring5.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
