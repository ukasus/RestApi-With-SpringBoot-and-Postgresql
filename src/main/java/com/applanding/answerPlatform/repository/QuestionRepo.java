package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
