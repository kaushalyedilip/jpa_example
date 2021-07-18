package com.example.jpa_example.repository;


import com.example.jpa_example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
