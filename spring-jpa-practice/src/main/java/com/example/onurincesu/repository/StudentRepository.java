package com.example.onurincesu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onurincesu.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	

}
