package com.example.jpa_example.service.impl;

import com.example.jpa_example.entity.Employee;
import com.example.jpa_example.repository.EmployeeRepository;
import com.example.jpa_example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployees(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        //Pageable pageable = PageRequest.of(0, 2, Sort.by("fistName").ascending().and(Sort.by("lastName").descending()));

        Page<Employee> page =  employeeRepository.findAll(pageable);

        return page.getContent();
        /*return page.get() map(s->new EmployeeDTO(s.getFirstName(), s.getLastName(), s.getCity()))
                .collect(Collectors.toList());*/
    }
}
