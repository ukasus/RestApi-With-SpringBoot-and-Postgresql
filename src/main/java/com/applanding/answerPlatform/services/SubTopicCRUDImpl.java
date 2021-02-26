package com.applanding.answerPlatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applanding.answerPlatform.entity.SubTopic;
import com.applanding.answerPlatform.entity.Topic;
import com.applanding.answerPlatform.repository.SubTopicRepo;

@Service
public class SubTopicCRUDImpl implements SubTopicCRUD {

	@Autowired
	SubTopicRepo subTopicRepo;
	
	@Override
	public void insertSubTopic(SubTopic subTopic) {
		// TODO Auto-generated method stub

	}

	@Override
	public Topic readSubTopic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic updateSubTopic(SubTopic SubTopic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic deleteSubTopic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
