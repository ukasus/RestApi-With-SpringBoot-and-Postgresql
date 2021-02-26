package com.applanding.answerPlatform.entity;

import javax.persistence.Entity;

@Entity
public class Question {
	
	private int id;
	private Company company;
	private SubTopic subTopic;
	private Tag tag;
	private User user;

}
