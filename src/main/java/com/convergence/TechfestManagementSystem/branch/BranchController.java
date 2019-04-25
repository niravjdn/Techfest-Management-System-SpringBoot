package com.convergence.TechfestManagementSystem.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping(value = "/branches")
	public List<Branch> getBranches(){
		return branchService.getAllBranches();
	}
	
	@RequestMapping(value = "/branches", method = RequestMethod.POST)
	public void addBranch(@RequestBody Branch branch){
		branchService.addBranch(branch);
	}
	
}
