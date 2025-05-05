package com.example.onurincesu.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotEmpty;

//will be used for insert and update 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message="İsim alanı boş bırakılamaz")
	private String firstName;
	private String lastName;
	private Date birthOfDate;

}
