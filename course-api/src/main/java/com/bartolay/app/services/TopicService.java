package com.bartolay.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bartolay.model.Topic;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring Framework", "Spring tutorial"),
			new Topic(2, "PHP Language", "php tutorial all")
		));
	
	public List<Topic> getAllTopics() {
		return this.topics;
	}
	
	public Topic getTopic(Integer id) {
		return topics.stream().filter(t -> t.getId() == id.intValue()).findFirst().get();
	}
	
	public void createTopic(Topic topic) {
		topics.add(topic);
	}
}
