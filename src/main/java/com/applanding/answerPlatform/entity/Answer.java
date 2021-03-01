package com.applanding.answerPlatform.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answerText;
	
	@ManyToOne
	@JoinColumn(name="questionID")
	@JsonIgnore
	private Question question;
	
	@OneToOne
	@JoinColumn(name="userID")
	private UserData user;
	
	@OneToMany(mappedBy = "answer")
	private List<AnswerLikes> answerLikes;
	
	@OneToMany(mappedBy = "answer")
	
	private List<Comment> comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public List<AnswerLikes> getAnswerLikes() {
		return answerLikes;
	}
	public void setAnswerLikes(List<AnswerLikes> answerLikes) {
		this.answerLikes = answerLikes;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	
	

}
