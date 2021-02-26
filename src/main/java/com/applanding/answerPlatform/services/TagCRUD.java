package com.applanding.answerPlatform.services;

import com.applanding.answerPlatform.entity.Tag;
import com.applanding.answerPlatform.entity.Topic;

public interface TagCRUD {
	void insertTag(Tag tag);
	Tag readTag(int id);
	Tag updateTag(Tag tag);
	void deleteTag(int id);

}
