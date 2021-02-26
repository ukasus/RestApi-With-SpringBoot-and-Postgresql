package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Tag;

public interface TagRepo extends JpaRepository<Tag, Integer> {

}
