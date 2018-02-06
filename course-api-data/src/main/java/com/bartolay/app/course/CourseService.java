package com.bartolay.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses(Integer topicId) {
		List<Course> courses = new ArrayList<>();
		this.courseDao.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(Integer courseId) {
		return this.courseDao.findOne(courseId);
	}
	
	public void createCourse(Course course) {
		System.out.println(course);
		this.courseDao.save(course);
	}

	public void updateCourse(Course course) {
		this.courseDao.save(course);
	}

	public void deleteCourse(Integer id) {
		this.courseDao.delete(id);
	}
}
