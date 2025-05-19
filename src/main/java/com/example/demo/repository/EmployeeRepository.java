package com.example.demo.repository;

import com.example.demo.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Integer> {
}