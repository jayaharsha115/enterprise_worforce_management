package com.enterprise.workforce_management.controller;

import com.enterprise.workforce_management.entity.Employee;
import com.enterprise.workforce_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable Long id){
        return employeeService.findEmployeeById(id);
    }
}
