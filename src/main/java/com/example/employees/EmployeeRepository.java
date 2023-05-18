package com.example.employees;

import org.hibernate.mapping.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value = "select department, max(salary), avg(salary) from employee group by department having count(*) > 1",nativeQuery = true)
    public String getAvdAndMax();
}

