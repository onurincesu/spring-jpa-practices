package com.example.onurincesu.controller;

import com.example.onurincesu.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
}
