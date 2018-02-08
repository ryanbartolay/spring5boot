package com.bartolay.app.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		this.topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(Integer id) {
		return this.topicRepository.findOne(id);
	}
	
	public void createTopic(Topic topic) {
		System.out.println(topic);
		this.topicRepository.save(topic);
	}

	public void updateTopic(Integer id, Topic topic) {
		this.topicRepository.save(topic);
	}

	public void deleteTopic(Integer id) {
		this.topicRepository.delete(id);
	}
}
