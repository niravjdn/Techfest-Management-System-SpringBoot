package com.convergence.TechfestManagementSystem.college;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CollegeService {

	@Autowired
	private CollegeRepository collegeRepository; 
	
	public List<College> getAllColleges() {
		List<College> collegeList = new ArrayList<College>();
		collegeRepository.findAll().forEach(collegeList::add);
		return collegeList;
	}

	public void addCollege(College college) {
		collegeRepository.save(college);
	}
	
	
	
	
}
