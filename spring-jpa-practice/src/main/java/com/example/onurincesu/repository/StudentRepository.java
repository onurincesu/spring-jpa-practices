package com.example.onurincesu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.onurincesu.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	//yukarıdaki HQL sorgusu sistemdeki değişken adlarını kullanıyorsun
	//alttaki SQL veri tabanındaki adları kullanıyorsun.
	
	@Query(value = "from Student",nativeQuery = false)
	//@Query(value="select * from student.student",nativeQuery = true)
	List<Student>findAllStudents();

	@Query(value = "from Student s WHERE s.id= :studentID")
	Optional<Student> findStudentById(Integer studentId);
}
