package com.bartolay.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(Integer topicId) {
		List<Course> courses = new ArrayList<>();
		this.courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(Integer courseId) {
		return this.courseRepository.findOne(courseId);
	}
	
	public void createCourse(Course course) {
		System.out.println(course);
		this.courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		this.courseRepository.save(course);
	}

	public void deleteCourse(Integer id) {
		this.courseRepository.delete(id);
	}
}
