package com.example.jpa_example.controller;

import com.example.jpa_example.entity.Employee;
import com.example.jpa_example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees/{pageNumber}/{pageSize}")
    public List<Employee> getEmployees(@PathVariable Integer pageNumber,@PathVariable Integer pageSize) {
        return employeeService.getEmployees(pageNumber,pageSize);
    }
}
