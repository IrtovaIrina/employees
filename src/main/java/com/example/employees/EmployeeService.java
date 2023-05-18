package com.example.employees;

import org.hibernate.mapping.Table;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeRepository repository;
    EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public String getAvgAndMax(){
        return repository.getAvdAndMax();
    }
}
