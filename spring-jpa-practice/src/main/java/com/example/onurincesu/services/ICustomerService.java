package com.example.onurincesu.services;

import com.example.onurincesu.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);

}
