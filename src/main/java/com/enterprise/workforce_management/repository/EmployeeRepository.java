package com.enterprise.workforce_management.repository;

import com.enterprise.workforce_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
