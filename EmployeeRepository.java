package com.example.employee_crud.repository;

import com.example.employee_crud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    void deleteByEmployeeId(String employeeId);
}
