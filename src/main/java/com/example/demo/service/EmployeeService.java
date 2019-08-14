package com.example.demo.service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.worker.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class EmployeeService {

    public final EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {

        return employeeRepository.save(employee);
    }

    public Optional<Employee> getById(@PathVariable Long id) {

        return employeeRepository.findById(id);
    }
}
