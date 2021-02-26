package com.applanding.answerPlatform.services;

import com.applanding.answerPlatform.entity.Company;

public interface CompanyCRUD {
	void insertCompany(Company company);
	Company readCompany(int id);
	Company updateCompany(Company company);
	Company deleteCompany(int id);
	

}
