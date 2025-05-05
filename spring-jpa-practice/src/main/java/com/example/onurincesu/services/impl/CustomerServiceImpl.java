package com.example.onurincesu.services.impl;

import java.beans.beancontext.BeanContext;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onurincesu.dto.DtoAddress;
import com.example.onurincesu.dto.DtoCustomer;
import com.example.onurincesu.entities.Address;
import com.example.onurincesu.entities.Customer;
import com.example.onurincesu.repository.CustomerRepository;
import com.example.onurincesu.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public DtoCustomer findCustomerById(Long id) {
		DtoCustomer dtoCustomer=new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		
		Optional<Customer>optional=customerRepository.findById(id);
		
		if (optional.isEmpty()) {
			return null;
		}
		Customer customer=optional.get();
		Address address = optional.get().getAddress();
		
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setAddress(dtoAddress);
		
		return dtoCustomer;
	}
	
	

}
