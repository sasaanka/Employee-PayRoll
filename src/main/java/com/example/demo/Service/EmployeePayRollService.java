package com.example.demo.Service;


import com.example.demo.DTO.EmployeePayRollDTO;
import com.example.demo.model.EmployeePayrollData;

import java.util.List;

public interface EmployeePayRollService {
    List<EmployeePayrollData> getAllEmployees();
    EmployeePayrollData getEmployeeById(int empId);
    EmployeePayrollData createEmployee(EmployeePayRollDTO dto);
    EmployeePayrollData updateEmployee(int empId, EmployeePayRollDTO dto);
    void deleteEmployee(int empId);
}