package com.convergence.TechfestManagementSystem.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
}
