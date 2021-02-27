package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.UserData;

public interface UserRepo extends JpaRepository<UserData, Integer> {

}
