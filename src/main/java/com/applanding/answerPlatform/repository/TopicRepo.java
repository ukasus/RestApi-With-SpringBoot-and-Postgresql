package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Topic;

public interface TopicRepo extends JpaRepository<Topic, Integer>{

}
