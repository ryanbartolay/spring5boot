package com.bartolay.app.course;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.bartolay.app.topic.Topic;

@Entity
public class Course {
	
	@Id
	private int id;
	private String name;
	private String description;
	private List<Topic> topics;

	public Course() {
		super();
	}
	public Course(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
}
