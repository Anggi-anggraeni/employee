package com.nha.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nha.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
