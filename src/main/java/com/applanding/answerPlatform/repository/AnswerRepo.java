package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
