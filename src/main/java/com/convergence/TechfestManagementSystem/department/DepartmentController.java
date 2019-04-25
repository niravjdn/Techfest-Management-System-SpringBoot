package com.convergence.TechfestManagementSystem.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/departments")
	public List<Department> getColleges(){
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping(value = "/departments", method = RequestMethod.POST)
	public void addDepartment(@RequestBody Department college){
		departmentService.addCollege(college);
	}
	
	@RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable Long id){
		departmentService.deleteDepartment(id);
	}
}