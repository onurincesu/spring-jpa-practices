package com.example.onurincesu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onurincesu.controller.IStudentController;
import com.example.onurincesu.dto.DtoStudent;
import com.example.onurincesu.dto.DtoStudentIU;
import com.example.onurincesu.entities.Student;
import com.example.onurincesu.services.IStudentService;

import jakarta.validation.Valid;


@RestController
@RequestMapping(path="/rest/api/student")
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
		return studentService.saveStudent(dtoStudentIU );
	}
	
	@GetMapping(path="/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
	}

	@Override
	@GetMapping(path = "/list/{id}")
	public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
		return studentService.getStudentById(id);
	}
	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);
	}

	@PutMapping(path="/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DtoStudentIU dtoStudentIU) {
		
		return studentService.updateStudent(id, dtoStudentIU);
	}
	

}
