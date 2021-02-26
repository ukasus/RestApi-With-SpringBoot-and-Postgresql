package com.applanding.answerPlatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applanding.answerPlatform.entity.SubTopic;

import com.applanding.answerPlatform.repository.SubTopicRepo;

@Service
public class SubTopicCRUDImpl implements SubTopicCRUD {

	@Autowired
	SubTopicRepo subTopicRepo;
	
	@Override
	public SubTopic insertSubTopic(SubTopic subTopic) {
		// TODO Auto-generated method stub
		return subTopicRepo.save(subTopic);

	}

	@Override
	public SubTopic readSubTopic(int id) {
		
		return subTopicRepo.findById(id).get();
	}

	@Override
	public SubTopic updateSubTopic(SubTopic subTopic) {
		return subTopicRepo.save(subTopic);
	}

	@Override
	public void deleteSubTopic(int id) {
		// TODO Auto-generated method stub
		subTopicRepo.deleteById(id);
	}

}
