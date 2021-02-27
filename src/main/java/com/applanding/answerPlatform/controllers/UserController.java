package com.applanding.answerPlatform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.entity.UserData;
import com.applanding.answerPlatform.repository.QuestionRepo;
import com.applanding.answerPlatform.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/insert")
	public UserData insertUser(@RequestBody UserData user)
	{
		
		return userRepo.save(user);
	}

}
