package com.applanding.answerPlatform.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.dto.QuestionInputDTO;
import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.entity.Question;
import com.applanding.answerPlatform.entity.Tag;
import com.applanding.answerPlatform.entity.Topic;
import com.applanding.answerPlatform.repository.QuestionRepo;
import com.applanding.answerPlatform.repository.UserRepo;
import com.applanding.answerPlatform.services.CompanyCRUD;
import com.applanding.answerPlatform.services.SubTopicCRUD;
import com.applanding.answerPlatform.services.TagCRUD;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionRepo questionRepo;
	@Autowired
	CompanyCRUD companyService;
	@Autowired 
	SubTopicCRUD subTopicService;
	@Autowired
	UserRepo userRepo;
	@Autowired
	TagCRUD tagService;
	
	@PostMapping("/insert")
	public int saveQuestion(@Valid @RequestBody QuestionInputDTO questionDTO)
	{
		List<Tag> tags=new ArrayList<>();;
		
		Question question=new Question();
		question.setQuestion(questionDTO.getQuestionText());
		if(questionDTO.getCompanyId()!=0)
		{
			List<Company> list=new ArrayList<>();
			list.add(companyService.readCompany(questionDTO.getCompanyId()));
			question.setCompany(list);
		}
		
		System.out.println("SubTopicId: "+questionDTO.getSubTopicId());
		question.setSubTopic(subTopicService.readSubTopic(questionDTO.getSubTopicId()));
		tags.clear();
		for(Tag tag:questionDTO.getTags())
		{
			
			tags.add(tagService.readTag(tag.getId()));
			
		}
		question.setTag(tags);
		
		if(questionDTO.getUserId()!=0)
			question.setUser(userRepo.findById(questionDTO.getUserId()).get());
		
		return questionRepo.save(question).getId();
		
	}
	
	@GetMapping("/get/{id}")
	public Question getQuestion(@PathVariable int id)
	{
		return questionRepo.findById(id).get();
	}

}
