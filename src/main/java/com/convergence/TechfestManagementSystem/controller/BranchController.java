package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.model.Branch;
import com.convergence.TechfestManagementSystem.service.BranchService;

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
	
	@RequestMapping(value = "/branches/{id}", method = RequestMethod.DELETE)
	public void deleteBranch(@PathVariable Long id){
		branchService.deleteBranch(id);
	}
}
