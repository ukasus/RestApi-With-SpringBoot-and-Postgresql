package com.applanding.answerPlatform.services;

import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.entity.Topic;

public interface TopicCRUD {
	void insertTopic(Topic topic);
	Topic readTopic(int id);
	Topic updateTopic(Topic topic);
	Topic deleteTopic(int id);

}
