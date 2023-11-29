package com.employee.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.service.exception.handling.EmployeeNotFoundException;
import com.employee.service.model.Employee;
import com.employee.service.repository.EmployeRepository;

/**
 * Service class responsible for managing Employee entities.
 */
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeRepository employeeRepository;

    /**
     * Retrieves a list of all employees.
     *
     * @return List of Employee entities
     */
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id ID of the employee to retrieve
     * @return Employee entity if found
     * @throws EmployeeNotFoundException if employee with given ID is not found
     */
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
    }

    /**
     * Creates a new employee.
     *
     * @param employee Employee entity to be created
     * @return Created Employee entity
     */
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Updates an existing employee by their ID.
     *
     * @param id             ID of the employee to be updated
     * @param employeeDetails Updated details of the employee
     * @return Updated Employee entity
     * @throws EmployeeNotFoundException if employee with given ID is not found
     */
    public Employee updateEmployee(int id, Employee employeeDetails) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
        	Employee employee = optionalEmployee.get();
            employee.setEmp_first_name(employeeDetails.getEmp_first_name());
            employee.setEmp_last_name(employeeDetails.getEmp_last_name());
            employee.setEmp_email(employeeDetails.getEmp_email());
            employee.setEmp_contact(employeeDetails.getEmp_contact());
            // Update other fields if needed
            return employeeRepository.save(employee);       
        }
        throw new EmployeeNotFoundException("Employee not found with ID: " + id);
    }

    /**
     * Deletes an employee by their ID.
     *
     * @param id ID of the employee to be deleted
     * @throws EmployeeNotFoundException if employee with given ID is not found
     */
    public void deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            throw new EmployeeNotFoundException("Employee not found with ID: " + id);
        }
    }
}
