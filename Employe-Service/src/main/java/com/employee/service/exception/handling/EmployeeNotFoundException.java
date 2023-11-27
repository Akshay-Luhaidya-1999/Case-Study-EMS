package com.employee.service.exception.handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception class to handle scenarios when an Employee is not found.
 * Throws a 404 NOT_FOUND status when an employee is not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    
    /**
     * Constructs an EmployeeNotFoundException with the specified detail message.
     *
     * @param message the detail message
     */
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
