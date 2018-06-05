package com.training.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
