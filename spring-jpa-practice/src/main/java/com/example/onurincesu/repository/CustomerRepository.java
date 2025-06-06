package com.example.onurincesu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onurincesu.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	

}
