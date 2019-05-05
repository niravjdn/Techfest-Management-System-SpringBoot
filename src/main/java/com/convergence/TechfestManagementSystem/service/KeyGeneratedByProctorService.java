package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;
import com.convergence.TechfestManagementSystem.repository.KeyGeneratedByProctorRepository;

@Service
public class KeyGeneratedByProctorService {

	@Autowired
	private KeyGeneratedByProctorRepository keyProctorService; 
	
	public List<KeyGeneratedByProctor> getAllKeys() {
		List<KeyGeneratedByProctor> keyList = new ArrayList<KeyGeneratedByProctor>();
		keyProctorService.findAll().forEach(keyList::add);;
		return keyList;
	}

	public void addKeyByProctor(String enrollmentNo) {
		KeyGeneratedByProctor key = new KeyGeneratedByProctor();
		key.setEnrollmentNo(enrollmentNo);
		key.setAddedBy("Change it here");
		keyProctorService.save(key);
	}

	public void deleteKeyByProctor(Long id) {
		keyProctorService.deleteById(id);
	}
}
