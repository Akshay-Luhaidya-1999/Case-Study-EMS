package com.employee.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.service.model.Employee;

/**
 * Repository interface for Employee entity, extending MongoRepository.
 * MongoRepository provides CRUD operations for the Employee entity.
 */
@Repository
public interface EmployeRepository extends MongoRepository<Employee, Integer> {

}
