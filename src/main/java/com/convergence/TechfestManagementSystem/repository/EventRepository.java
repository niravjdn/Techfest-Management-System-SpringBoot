package com.convergence.TechfestManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.convergence.TechfestManagementSystem.model.Department;
import com.convergence.TechfestManagementSystem.model.Events;

public interface EventRepository extends CrudRepository<Events, Long>{
	List<Events> findByDepartment(Department department);
}
