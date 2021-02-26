package com.applanding.answerPlatform.services;

import com.applanding.answerPlatform.entity.SubTopic;
import com.applanding.answerPlatform.entity.Topic;

public interface SubTopicCRUD {
	void insertSubTopic(SubTopic subTopic);
	Topic readSubTopic(int id);
	Topic updateSubTopic(SubTopic SubTopic);
	Topic deleteSubTopic(int id);

}
