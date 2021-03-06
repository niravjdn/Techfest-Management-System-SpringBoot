package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convergence.TechfestManagementSystem.model.Branch;
import com.convergence.TechfestManagementSystem.repository.BranchRepository;


@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository; 
	
	public List<Branch> getAllBranches() {
		List<Branch> branchList = new ArrayList<Branch>();
		branchRepository.findAll().forEach(branchList::add);
		return branchList;
	}

	public void addBranch(Branch branch) {
		branchRepository.save(branch);
	}

	public void deleteBranch(Long id) {
		branchRepository.deleteById(id);
	}
}
