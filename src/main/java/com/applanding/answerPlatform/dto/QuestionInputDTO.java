package com.applanding.answerPlatform.dto;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.applanding.answerPlatform.entity.*;

public class QuestionInputDTO {
	
	@Size(min=50,max=500,message = "QuestionText should be bewteen 50 and 500 characters long.")
	private String questionText;
	private int companyId;
	@NotNull
	private int subTopicId;
	private List<Tag> tags;
	private int userId;
	
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getSubTopicId() {
		return subTopicId;
	}
	public void setSubTopicId(int subTopicId) {
		this.subTopicId = subTopicId;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
