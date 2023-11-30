package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.model.Department;
import com.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
    private DepartmentService departmentService;

	// Retrieve all departments
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    // Retrieve a department by ID
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable int id) {
        Department department = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    // Create a new department
    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department createdDepartment = departmentService.createDepartment(department);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    // Update a department by ID
    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable int id, @RequestBody Department department) {
        Department updatedDepartment = departmentService.updateDepartment(id, department);
        return new ResponseEntity<>(updatedDepartment, HttpStatus.OK);
    }

    // Delete a department by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
