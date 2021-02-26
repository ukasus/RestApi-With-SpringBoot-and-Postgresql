package com.applanding.answerPlatform.services;

import com.applanding.answerPlatform.entity.SubTopic;


public interface SubTopicCRUD {
	SubTopic insertSubTopic(SubTopic subTopic);
	SubTopic readSubTopic(int id);
	SubTopic updateSubTopic(SubTopic SubTopic);
	void deleteSubTopic(int id);

}
