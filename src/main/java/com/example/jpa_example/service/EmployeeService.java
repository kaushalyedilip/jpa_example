package com.example.jpa_example.service;

import com.example.jpa_example.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);
    List<Employee> getEmployees();

    List<Employee> getEmployees(Integer pageNumber, Integer pageSize);
}
