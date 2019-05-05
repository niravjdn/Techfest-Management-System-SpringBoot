package com.convergence.TechfestManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;



public interface KeyGeneratedByProctorRepository extends CrudRepository<KeyGeneratedByProctor, Long>{
	public List<KeyGeneratedByProctor> findByAddedBy(String addedBy);
}
