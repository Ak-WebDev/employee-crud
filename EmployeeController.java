package com.example.employee_crud.controller;


import com.example.employee_crud.model.Employee;
import com.example.employee_crud.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/displayAll")
    public List<Employee> displayAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/display/{employeeId}")
    public Employee displayEmployeeById(@PathVariable String employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @PutMapping("/update/{employeeId}")
    public Employee updateEmployee(@RequestBody Employee updatedEmployee, @PathVariable String employeeId) {
        Employee existingEmployee = employeeRepository.findById(employeeId).orElse(null);

        if (existingEmployee != null) {
            existingEmployee.setEmployeeName(updatedEmployee.getEmployeeName());
            existingEmployee.setEmployeeEmail(updatedEmployee.getEmployeeEmail());
            existingEmployee.setLocation(updatedEmployee.getLocation());
            return employeeRepository.save(existingEmployee);
        }
        return null;
    }

    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteByEmployeeId(employeeId);
    }
}
