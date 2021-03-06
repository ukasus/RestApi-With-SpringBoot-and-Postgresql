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
import com.applanding.answerPlatform.entity.Tag;
import com.applanding.answerPlatform.services.CompanyCRUDImpl;
import com.applanding.answerPlatform.services.TagCRUD;

@RestController
@RequestMapping("/tag")
public class TagController {
	@Autowired
	TagCRUD tagService;
	
	@PostMapping("/insert")
	@ResponseBody
	public String insertTag(@RequestBody Tag tag)
	{
		tagService.insertTag(tag);
		return "Tag with ID: "+tag.getId()+" inserted successfully.";
	}
	
	@GetMapping("/get/{id}")
	public Tag getTag(@PathVariable int id)
	{
		return tagService.readTag(id);
	}
	
	@PutMapping("/update")
	public Tag updateCompany(@RequestBody Tag tag)
	{
		return tagService.updateTag(tag);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteTag(@PathVariable int id)
	{
		tagService.deleteTag(id);
		return "Tag with ID: "+id+" deleted successfully.";
		
	}

}

