package com.applanding.answerPlatform.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.applanding.answerPlatform.entity.Company;
import com.applanding.answerPlatform.services.CompanyCRUD;


@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyCRUD companyService;
	
	@PostMapping("/insert")
	@ResponseBody
	public String insertCompany(@RequestBody Company company)
	{
		companyService.insertCompany(company);
		return "Company with Name: "+company.getCompanyName()+" inserted successfully.";
	}
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public Company getCompany(@PathVariable("id") int id)
	{
//		System.out.println(id);
//		Company company=companyService.readCompany(id);
//		System.out.println(company.getCompanyName());
		return companyService.readCompany(id);
	}
	
	@PutMapping("/update")
	public Company updateCompany(@RequestBody Company company)
	{
		return companyService.updateCompany(company);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteCompany(@PathVariable int id)
	{
		companyService.deleteCompany(id);
		return "Company with ID: "+id+" deleted successfully.";
	}

}
