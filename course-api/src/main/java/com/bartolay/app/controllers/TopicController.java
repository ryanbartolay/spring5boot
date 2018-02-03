package com.bartolay.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bartolay.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return Arrays.asList(
					new Topic(1, "Spring Framework", "Spring tutorial"),
					new Topic(2, "PHP Language", "php tutorial all")
				);
	}
}
