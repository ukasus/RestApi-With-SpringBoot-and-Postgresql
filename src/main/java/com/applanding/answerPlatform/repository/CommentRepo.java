package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
