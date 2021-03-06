package com.applanding.answerPlatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applanding.answerPlatform.entity.Topic;
import com.applanding.answerPlatform.repository.TopicRepo;

@Service
public class TopicCRUDImpl implements TopicCRUD{
	@Autowired
	TopicRepo topicRepo;

	@Override
	public void insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepo.save(topic);
		
	}

	@Override
	public Topic readTopic(int id) {
		// TODO Auto-generated method stub
		return topicRepo.findById(id).get();
	}

	@Override
	public Topic updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		return topicRepo.save(topic);
	}

	@Override
	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		topicRepo.deleteById(id);
	}

}
