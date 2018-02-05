package com.bartolay.app.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService topicService;
	
	@RequestMapping("/topics")
	public List<Course> getAllTopics() {
		// TODO Auto-generated method stub
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Course getTopic(@PathVariable Integer id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void createTopic(@RequestBody Course topic) {
		topicService.createTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@PathVariable Integer id, @RequestBody Course topic) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}
}
