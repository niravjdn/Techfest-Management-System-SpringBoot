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
import com.convergence.TechfestManagementSystem.model.College;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByCampaigner;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;
import com.convergence.TechfestManagementSystem.service.BranchService;
import com.convergence.TechfestManagementSystem.service.KeyGeneratedByCampaignerService;
import com.convergence.TechfestManagementSystem.service.KeyGeneratedByProctorService;

@RestController
@RequestMapping("/campaigner")
public class KeyByCampaignerController {
	
	@Autowired
	private KeyGeneratedByCampaignerService keyService;
	
	@RequestMapping(value = "/keys")
	public List<KeyGeneratedByCampaigner> getAllKeys(){
		return keyService.getAllKeys();
	}
	
	@RequestMapping(value = "/keys/{addedBy}")
	public List<KeyGeneratedByCampaigner> getAllKeys(String addedBy){
		return keyService.getAllKeys();
	}
	
	@RequestMapping(value = "/keys", method = RequestMethod.POST)
	public void addkeyByProctor(@RequestBody String name, String email, College college, String mobileNo){
		keyService.addKeyByCampaigener(name, email, college, mobileNo);;
	}
	
	@RequestMapping(value = "/keys/{id}", method = RequestMethod.DELETE)
	public void deleteKeyByProctor(@PathVariable Long id){
		keyService.deleteKeyByCampaigner(id);
	}
}
