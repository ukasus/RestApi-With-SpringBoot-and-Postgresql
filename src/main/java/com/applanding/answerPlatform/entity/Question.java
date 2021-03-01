package com.applanding.answerPlatform.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	
	private String question;
	@OneToMany
	@JoinColumn(name="companyID")
	private List<Company> company;
	
	
	@OneToOne
	@JoinColumn(name="subTopicID")
	
	private SubTopic subTopic;
	
	@ManyToMany
	@JoinColumn(name="tagID")
	private List<Tag> tag;
	
	
	@ManyToOne
	@JoinColumn(name="userID")
	private UserData user;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answers;
	
	@OneToMany(mappedBy="question")
	private List<QuestionLikes> questionLikes;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	public SubTopic getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(SubTopic subTopic) {
		this.subTopic = subTopic;
	}
	public List<Tag> getTag() {
		return tag;
	}
	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public List<QuestionLikes> getQuestionLikes() {
		return questionLikes;
	}
	public void setQuestionLikes(List<QuestionLikes> questionLikes) {
		this.questionLikes = questionLikes;
	}
	
	

}
