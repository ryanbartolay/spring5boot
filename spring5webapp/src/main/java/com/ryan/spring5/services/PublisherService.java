package com.ryan.spring5.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ryan.spring5.model.Publisher;
import com.ryan.spring5.repositories.PublisherRepository;

@Service
public class PublisherService {
	private PublisherRepository publisherRepository;

	public PublisherService(PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
	}
	
	public List<Publisher> getAllPublishers() {
		List<Publisher> publishers = new ArrayList<>();
		publisherRepository.findAll().forEach(p -> publishers.add(p));
		return publishers;
	}
}
