package com.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final List<String> employees = new ArrayList<>();
    
    @PostMapping("/create")
    public String createEmployee(@RequestBody String name) {
        employees.add(name);
        return "Employee " + name + " added!";
    }
    
    @GetMapping
    public List<String> listEmployees() {
        return employees;
    }
}
