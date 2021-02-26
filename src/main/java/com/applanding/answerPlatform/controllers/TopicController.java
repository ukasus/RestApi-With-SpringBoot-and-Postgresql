package com.applanding.answerPlatform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.entity.Topic;
import com.applanding.answerPlatform.services.CompanyCRUDImpl;
import com.applanding.answerPlatform.services.TopicCRUD;

@RestController
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	TopicCRUD topicService;
	
	@PostMapping("/insert")
	public void insertTopic(@RequestBody Topic topic)
	{
		
	}
	
	@GetMapping("/get/{id}")
	public Topic getTopic(@PathVariable int id)
	{
		return new Topic();
	}
	
	@PutMapping("/update")
	public Topic updateTopic(@RequestBody Topic topic)
	{
		return new Topic();
	}
	
	@DeleteMapping("/delete/{id}")
	public Topic deleteTopic(@PathVariable int id)
	{
		return new Topic();
	}

}
