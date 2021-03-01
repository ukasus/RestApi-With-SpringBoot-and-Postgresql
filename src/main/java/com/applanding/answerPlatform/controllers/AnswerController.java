package com.applanding.answerPlatform.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.dto.AnswerInputDTO;
import com.applanding.answerPlatform.dto.AnswerLikesInputDTO;
import com.applanding.answerPlatform.entity.Answer;
import com.applanding.answerPlatform.entity.AnswerLikes;
import com.applanding.answerPlatform.repository.AnswerLikesRepo;
import com.applanding.answerPlatform.repository.AnswerRepo;
import com.applanding.answerPlatform.repository.QuestionRepo;
import com.applanding.answerPlatform.repository.UserRepo;

@RestController
@RequestMapping("/answer")
public class AnswerController {
	
	@Autowired
	QuestionRepo questionRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	AnswerRepo answerRepo;
	@Autowired
	AnswerLikesRepo answerLikeRepo;
	
	@PostMapping("/insert")
	public int insertAnswer(@Valid @RequestBody AnswerInputDTO answerInput)
	{
		Answer answer=new Answer();
		if(answerInput.getUserId()!=0)
		{
			answer.setUser(userRepo.findById(answerInput.getUserId()).get());
		}
		if(answerInput.getQuestionId()!=0)
		{
			answer.setQuestion(questionRepo.findById(answerInput.getQuestionId()).get());
		}
		answer.setAnswerText(answerInput.getAnswerText());
		return answerRepo.save(answer).getId();
	}
	
	@PostMapping("/inserAnswerLike")
	@ResponseBody
	public String insertAnswerLike(@RequestBody AnswerLikesInputDTO answerLikeInput)
	{
		AnswerLikes answerLike=new AnswerLikes();
		answerLike.setAnswer(answerRepo.findById(answerLikeInput.getAnswerId()).get());
		answerLike.setUser(userRepo.findById(answerLikeInput.getUserId()).get());
		answerLikeRepo.save(answerLike);
		return "Success";
	}

}
