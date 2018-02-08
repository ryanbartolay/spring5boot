package com.ryan.spring5.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.spring5.model.Publisher;
import com.ryan.spring5.services.PublisherService;

@RestController
public class PublisherController {

	private PublisherService publisherService;

	public PublisherController(PublisherService publisherService) {
		super();
		this.publisherService = publisherService;
	}
	
	@RequestMapping("/publishers")
	public List<Publisher> getAllPublishers() {
		return publisherService.getAllPublishers();
	}
}
