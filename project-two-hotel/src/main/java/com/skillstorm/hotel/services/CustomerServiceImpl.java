package com.skillstorm.hotel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.hotel.models.Customers;
import com.skillstorm.hotel.repositories.CustomerRepository;

/**
 * Service class for customers which implements the methods in 
 * the CustomerService interface, and executes the queries using 
 * the CustomerRepository interface. Each CRUD functionality is 
 * available using the respective method, as well as any methods 
 * stated within the CustomerRepository interface.
 * 
 * @author Todd Foreman
 *
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	/**
	 * Auto wiring the repository to allow queries to be executed using a CustomerRepository object.
	 */
	@Autowired
	private CustomerRepository repository;
	
	/**
	 * Finds the customer id based on the specified id number.
	 */
	@Override
	public Customers findById(int id) {
		Optional<Customers> customer = repository.findById(id);
		return customer.isPresent() ? customer.get() : null;
	}

	/**
	 * Creates a new customer.
	 */
	@Override
	public Customers save(Customers customer) {
		return repository.save(customer);
	}

	/**
	 * Deletes a customer based on the customer ID that is specified.
	 */
	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
