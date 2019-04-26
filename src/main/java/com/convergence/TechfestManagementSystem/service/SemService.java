package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convergence.TechfestManagementSystem.model.Sem;
import com.convergence.TechfestManagementSystem.repository.SemRepository;


@Service
public class SemService {

	@Autowired
	private SemRepository semRepository; 
	
	public List<Sem> getAllSems() {
		List<Sem> semList = new ArrayList<Sem>();
		semRepository.findAll().forEach(semList::add);
		return semList;
	}

	public void addSem(Sem sem) {
		semRepository.save(sem);
	}

	public void deleteSem(Integer id) {
		semRepository.deleteById(id);
	}
}
