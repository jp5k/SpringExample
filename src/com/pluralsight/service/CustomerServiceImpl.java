package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// When configured using Spring, no need for the new object to be created
	// below
	// Autowiring will create this instance for us.
	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();

	// NOTE - can autowire using three different approaches:
	// Member Variables (typically use this approach !!!!)
	// Constructor
	// Setter

	//SOOOOO, having @Service stereotype allows us get the customerService bean in our Application main method.
	// The customerRepository bean is autowired by spring by recognising the customerRepository 
	// member name, and wiring this up against the @Repository("customerRepository") in
	// HibernateCustomerRepository.
	// Coding against the interface makes this clean, and means we can use any database implementation 
	// (simply remove the Hibernate, and replace with another.  No need for any other code changes.  
	
	
	@Autowired
	private CustomerRepository customerRepository;

	
	public List<Customer> findAll() {
		return customerRepository.finalAll();

	}

}
