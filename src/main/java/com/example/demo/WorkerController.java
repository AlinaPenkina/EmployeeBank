package com.example.demo;

import com.example.demo.service.EmployeeService;
import com.example.demo.worker.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class WorkerController {
    public final EmployeeService employeeService;

    WorkerController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello!";
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable Long id) {

        return employeeService.getById(id);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}