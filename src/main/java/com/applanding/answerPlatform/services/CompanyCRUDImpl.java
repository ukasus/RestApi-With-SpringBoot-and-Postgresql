package com.applanding.answerPlatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.repository.CompanyRepo;

@Service
public class CompanyCRUDImpl implements CompanyCRUD{
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public void insertCompany(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Company readCompany(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company deleteCompany(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
