package com.applanding.answerPlatform.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.dto.CommentInputDTO;
import com.applanding.answerPlatform.entity.Comment;
import com.applanding.answerPlatform.repository.AnswerRepo;
import com.applanding.answerPlatform.repository.CommentRepo;
import com.applanding.answerPlatform.repository.UserRepo;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	AnswerRepo answerRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	CommentRepo commentRepo;
	
	@PostMapping("/insert")
	public int insertComment(@Valid @RequestBody CommentInputDTO commentInput)
	{
		Comment comment=new Comment();
		comment.setAnswer(answerRepo.findById(commentInput.getAnswerId()).get());
		comment.setUser(userRepo.findById(commentInput.getUserId()).get());
		comment.setCommentText(commentInput.getCommentText());
		
		return commentRepo.save(comment).getId();
	}

}
