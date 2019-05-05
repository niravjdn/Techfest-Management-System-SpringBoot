package com.convergence.TechfestManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convergence.TechfestManagementSystem.model.Department;
import com.convergence.TechfestManagementSystem.repository.DepartmentRepository;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository; 
	
	public List<Department> getAllDepartments() {
		List<Department> departmentList = new ArrayList<Department>();
		departmentRepository.findAll().forEach(departmentList::add);
		return departmentList;
	}

	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}
