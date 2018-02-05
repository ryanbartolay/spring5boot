package com.bartolay.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseDao topicDao;

	public List<Course> getAllTopics() {
		List<Course> topics = new ArrayList<>();
		this.topicDao.findAll().forEach(topics::add);
		return topics;
	}
	
	public Course getTopic(Integer id) {
		return this.topicDao.findOne(id);
	}
	
	public void createTopic(Course topic) {
		System.out.println(topic);
		this.topicDao.save(topic);
	}

	public void updateTopic(Integer id, Course topic) {
		this.topicDao.save(topic);
	}

	public void deleteTopic(Integer id) {
		this.topicDao.delete(id);
	}
}
