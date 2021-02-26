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
import com.applanding.answerPlatform.entity.SubTopic;
import com.applanding.answerPlatform.services.SubTopicCRUD;

@RestController
@RequestMapping("/subTopic")
public class SubTopicController {
	@Autowired
	SubTopicCRUD subTopicService;
	
	@PostMapping("/insert")
	public void insertSubTopic(@RequestBody SubTopic subTopic)
	{
		
	}
	
	@GetMapping("/get/{id}")
	public SubTopic getSubTopic(@PathVariable int id)
	{
		return new SubTopic();
	}
	
	@PutMapping("/update")
	public SubTopic updateSubTopic(@RequestBody SubTopic subTopic)
	{
		return new SubTopic();
	}
	
	@DeleteMapping("/delete/{id}")
	public SubTopic deleteSubTopic(@PathVariable int id)
	{
		return new SubTopic();
	}

}
