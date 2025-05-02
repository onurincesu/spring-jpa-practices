package com.example.onurincesu.controller;

import java.util.List;

import com.example.onurincesu.dto.DtoStudent;
import com.example.onurincesu.dto.DtoStudentIU;
import com.example.onurincesu.entities.Student;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);

}
