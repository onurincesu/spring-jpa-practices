package com.example.onurincesu.services.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onurincesu.dto.DtoStudent;
import com.example.onurincesu.dto.DtoStudentIU;
import com.example.onurincesu.entities.Student;
import com.example.onurincesu.repository.StudentRepository;
import com.example.onurincesu.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent response=new DtoStudent();
		Student student=new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);
		
		Student dbStudent=studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		
		return response;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent>dtoList=new ArrayList<>();
		
		List<Student>studentsList =studentRepository.findAll();
		for (Student student : studentsList) {
			DtoStudent dto =new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);		
			
		}
		return dtoList;
		
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dto = new DtoStudent();
		Optional<Student>optional=studentRepository.findById(id);
		if(optional.isPresent()) {
			Student dbStudent=optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto;
	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional=	studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent =optional.get();
			
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			
			Student updatedStudent=studentRepository.save(dbStudent);
			BeanUtils.copyProperties(updatedStudent,dto);
			return dto;
			
		}
		return null;
		
	}
	
	

}
