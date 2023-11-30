package com.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.exception.handling.DepartmentNotFoundException;
import com.department.model.Department;
import com.department.repository.DepartmentRepository;

//Indicates that this class is a service component
@Service
public class DepartmentService {
	
 @Autowired
 private DepartmentRepository departmentRepository;

 // Retrieve all departments
 public List<Department> getAllDepartments() {
     return departmentRepository.findAll();
 }

 // Retrieve a department by ID
 public Department getDepartmentById(int id) {
     return departmentRepository.findById(id)
             .orElseThrow(() -> new DepartmentNotFoundException("Department not found with ID: " + id));
 }

 // Create a new department
 public Department createDepartment(Department department) {
     return departmentRepository.save(department);
 }

 // Update a department by ID
 public Department updateDepartment(int id, Department departmentDetails) {
     Optional<Department> optionalDepartment = departmentRepository.findById(id);
     if (optionalDepartment.isPresent()) {
         Department department = optionalDepartment.get();
         department.setDepartmentName(departmentDetails.getDepartmentName());
         // Update other fields if needed
         return departmentRepository.save(department);
     }
     throw new DepartmentNotFoundException("Department not found with ID: " + id);
 }

 // Delete a department by ID
 public void deleteDepartment(int id) {
     if (departmentRepository.existsById(id)) {
         departmentRepository.deleteById(id);
     } else {
         throw new DepartmentNotFoundException("Department not found with ID: " + id);
     }
 }
}
