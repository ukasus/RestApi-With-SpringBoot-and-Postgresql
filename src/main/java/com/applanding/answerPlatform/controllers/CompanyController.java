package com.applanding.answerPlatform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.services.CompanyCRUD;


@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyCRUD companyService;
	
	@PostMapping("/insert")
	public void insertCompany(@RequestBody Company company)
	{
		
	}
	
	@GetMapping("/get/{id}")
	public Company getCompany(@PathVariable int id)
	{
		return new Company();
	}
	
	@PutMapping("/update")
	public Company updateCompany(@RequestBody Company company)
	{
		return new Company();
	}
	
	@DeleteMapping("/delete/{id}")
	public Company deleteCompany(@PathVariable int id)
	{
		return new Company();
	}

}
