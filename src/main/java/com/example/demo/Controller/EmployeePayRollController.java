package com.example.demo.Controller;

import com.example.demo.DTO.EmployeePayRollDTO;
import com.example.demo.model.EmployeePayrollData;
import com.example.demo.Service.EmployeePayRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

    @Autowired
    private EmployeePayRollService service;

    @GetMapping
    public List<EmployeePayrollData> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayRollDTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable int id, @RequestBody EmployeePayRollDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted employee with ID: " + id;
    }
}