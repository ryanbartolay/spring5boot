package com.bartolay.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartolay.app.dao.TopicDao;
import com.bartolay.app.model.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicDao topicDao;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring Framework", "Spring tutorial"),
			new Topic(2, "PHP Language", "php tutorial all")
		));
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		this.topicDao.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(Integer id) {
		return this.topicDao.findOne(id);
	}
	
	public void createTopic(Topic topic) {
		System.out.println(topic);
		this.topicDao.save(topic);
	}

	public void updateTopic(Integer id, Topic topic) {
		for(int i = 0; i < topics.size(); ++i) {
			if(topics.get(i).getId() == id.intValue()) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(Integer id) {
		topics.removeIf(t -> t.getId() == id.intValue());
	}
}
