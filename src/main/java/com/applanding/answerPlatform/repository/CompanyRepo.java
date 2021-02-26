package com.applanding.answerPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applanding.answerPlatform.entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
