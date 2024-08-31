package com.javaguide.Springboot_backend.repository;

import com.javaguide.Springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
