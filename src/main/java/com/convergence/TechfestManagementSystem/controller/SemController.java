package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.model.Sem;
import com.convergence.TechfestManagementSystem.service.SemService;

@RestController
public class SemController {
	
	@Autowired
	private SemService semService;
	
	@RequestMapping(value = "/sems")
	public List<Sem> getBranches(){
		return semService.getAllSems();
	}
	
	@RequestMapping(value = "/sems", method = RequestMethod.POST)
	public void addSem(@RequestBody Sem sem){
		semService.addSem(sem);
	}
	
	@RequestMapping(value = "/sems/{id}", method = RequestMethod.DELETE)
	public void deleteSem(@PathVariable Integer id){
		semService.deleteSem(id);
	}
}
