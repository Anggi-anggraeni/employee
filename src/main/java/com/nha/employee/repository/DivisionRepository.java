package com.nha.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nha.employee.model.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long>{

}
