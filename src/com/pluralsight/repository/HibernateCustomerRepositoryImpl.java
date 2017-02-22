package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

// Use the Repository annotation 
// the name should be the interface we're coding against, and should have first name
// lowecase (signifying an instance of that object)

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> finalAll() {

		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();

		customer.setFirstname("John");
		customer.setLastname("P");

		customers.add(customer);

		return customers;

	}

}
