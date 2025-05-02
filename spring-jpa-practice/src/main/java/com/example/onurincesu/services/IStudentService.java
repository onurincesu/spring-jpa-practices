package com.example.onurincesu.services;

import java.util.List;

import com.example.onurincesu.dto.DtoStudent;
import com.example.onurincesu.dto.DtoStudentIU;
import com.example.onurincesu.entities.Student;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);

}
