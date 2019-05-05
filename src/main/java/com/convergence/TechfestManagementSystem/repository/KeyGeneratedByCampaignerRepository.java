package com.convergence.TechfestManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.convergence.TechfestManagementSystem.model.KeyGeneratedByCampaigner;
import com.convergence.TechfestManagementSystem.model.KeyGeneratedByProctor;



public interface KeyGeneratedByCampaignerRepository extends CrudRepository<KeyGeneratedByCampaigner, Long>{
	public List<KeyGeneratedByCampaigner> findByAddedBy(String addedBy);
}
