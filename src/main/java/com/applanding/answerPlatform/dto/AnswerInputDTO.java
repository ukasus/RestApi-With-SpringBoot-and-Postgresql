package com.applanding.answerPlatform.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AnswerInputDTO {
	
	private int questionId;
	@NotNull
	@Size(min=50,max=500,message = "Answer Length should between 50 to 500.")
	private String answerText;
	private int userId;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
