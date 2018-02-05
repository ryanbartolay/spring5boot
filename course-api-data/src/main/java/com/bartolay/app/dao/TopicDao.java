package com.bartolay.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bartolay.app.model.Topic;

@Repository
public interface TopicDao extends CrudRepository<Topic, Integer>{
	
}