package com.convergence.TechfestManagementSystem.department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository; 
	
	public List<Department> getAllDepartments() {
		List<Department> departmentList = new ArrayList<Department>();
		departmentRepository.findAll().forEach(departmentList::add);
		return departmentList;
	}

	public void addCollege(Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}
