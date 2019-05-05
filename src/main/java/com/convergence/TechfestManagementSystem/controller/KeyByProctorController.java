package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.config.Config;
import com.convergence.TechfestManagementSystem.model.Branch;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;
import com.convergence.TechfestManagementSystem.service.BranchService;
import com.convergence.TechfestManagementSystem.service.KeyGeneratedByProctorService;

@RestController
@RequestMapping("/proctor")
public class KeyByProctorController {
	
	@Autowired
	private KeyGeneratedByProctorService keyService;
	
	@RequestMapping(value = "/keys")
	public List<KeyGeneratedByProctor> getBranches(){
		return keyService.getAllKeys();
	}
	
	@RequestMapping(value = "/keys", method = RequestMethod.POST)
	public void addkeyByProctor(@RequestBody String enrollmentNo){
		keyService.addKeyByProctor(enrollmentNo);
	}
	
	@RequestMapping(value = "/keys/{id}", method = RequestMethod.DELETE)
	public void deleteKeyByProctor(@PathVariable Long id){
		keyService.deleteKeyByProctor(id);
	}
}
