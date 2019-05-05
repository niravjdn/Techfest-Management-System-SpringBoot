package com.convergence.TechfestManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.convergence.TechfestManagementSystem.model.Department;
import com.convergence.TechfestManagementSystem.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/departments")
	public List<Department> getColleges(){
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping(value = "/departments", method = RequestMethod.POST)
	public void addDepartment(@RequestBody Department department){
		departmentService.addDepartment(department);
	}
	
	@RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable Long id){
		departmentService.deleteDepartment(id);
	}
}
