package com.bartolay.app.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends CrudRepository<Topic, Integer>{
	
}