package com.applanding.answerPlatform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody
	public String insertTopic(@RequestBody Topic topic)
	{
		topicService.insertTopic(topic);
		return "Topic with ID: "+topic.getId()+" inserted successfully.";
		
	}
	
	@GetMapping("/get/{id}")
	public Topic getTopic(@PathVariable int id)
	{
		return topicService.readTopic(id);
	}
	
	@PutMapping("/update")
	public Topic updateTopic(@RequestBody Topic topic)
	{
		return topicService.updateTopic(topic);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteTopic(@PathVariable int id)
	{
		topicService.deleteTopic(id);
		return "Topic with ID: "+id+" deleted successfully.";
	}

}
