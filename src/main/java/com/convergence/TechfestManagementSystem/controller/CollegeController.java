package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.model.College;
import com.convergence.TechfestManagementSystem.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService branchService;
	
	@RequestMapping(value = "/colleges")
	public List<College> getColleges(){
		return branchService.getAllColleges();
	}
	
	@RequestMapping(value = "/colleges", method = RequestMethod.POST)
	public void addCollege(@RequestBody College college){
		branchService.addCollege(college);
	}
	
	@RequestMapping(value = "/colleges/{id}", method = RequestMethod.DELETE)
	public void deleteCollege(@PathVariable Long id){
		branchService.deleteCollge(id);
	}
}
