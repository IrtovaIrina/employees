package com.example.employees;

import org.hibernate.mapping.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService service;
    EmployeeController(EmployeeService service){
        this.service = service;
    }
    @GetMapping
    public String get(){
        return service.getAvgAndMax();
    }
}
