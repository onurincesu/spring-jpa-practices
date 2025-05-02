 package com.example.onurincesu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//will be used in get methods
//Variable names must be same with entities
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {
	
	private String firstName;
	private String lastName;
	
}
