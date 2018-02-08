package com.bartolay.app.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bartolay.app.course.Course;
import com.bartolay.app.course.CourseRepository;
import com.bartolay.app.topic.Topic;
import com.bartolay.app.topic.TopicRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private TopicRepository topicRepository;
	private CourseRepository courseRepository;
	
	public DevBootstrap(TopicRepository topicRepository, CourseRepository courseRepository) {
		super();
		this.topicRepository = topicRepository;
		this.courseRepository = courseRepository;
	}

	private void initData() {
		Topic topic1 = new Topic("Java 8", "All about Java 8");
		
		Course course1 = new Course("Java 8 101", "Intro to Java 8");
		course1.setTopic(topic1);
		
		Course course2 = new Course("Java 8 102", "Intermidiate Java 8");
		course2.setTopic(topic1);
		
		topicRepository.save(topic1);
		courseRepository.save(course1);
		courseRepository.save(course2);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		this.initData();
	}
}
