package com.department.exception.handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Custom exception to handle Department Not Found scenario
@ResponseStatus(HttpStatus.NOT_FOUND)
public class DepartmentNotFoundException extends RuntimeException {
	
    // Constructor to set the exception message
	public DepartmentNotFoundException(String message) {
        super(message);
    }
}
