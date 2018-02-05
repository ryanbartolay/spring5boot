package com.bartolay.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		this.courseDao.findAll().forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(Integer id) {
		return this.courseDao.findOne(id);
	}
	
	public void createCourse(Course course) {
		System.out.println(course);
		this.courseDao.save(course);
	}

	public void updateCourse(Integer id, Course course) {
		this.courseDao.save(course);
	}

	public void deleteCourse(Integer id) {
		this.courseDao.delete(id);
	}
}
