package com.applanding.answerPlatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applanding.answerPlatform.entity.Tag;
import com.applanding.answerPlatform.repository.TagRepo;

@Service
public class TagCRUDImpl implements TagCRUD{
	@Autowired
	TagRepo tagRepo;

	@Override
	public void insertTag(Tag tag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tag readTag(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tag updateTag(Tag tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tag deleteTag(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
