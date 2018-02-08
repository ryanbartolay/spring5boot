package com.ryan.spring5.restcontrollers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.spring5.model.Publisher;
import com.ryan.spring5.services.PublisherService;

@RestController
public class PublisherRestController {

	private PublisherService publisherService;

	public PublisherRestController(PublisherService publisherService) {
		super();
		this.publisherService = publisherService;
	}
	
	@RequestMapping("/publishers")
	public List<Publisher> getAllPublishers() {
		return publisherService.getAllPublishers();
	}
}
