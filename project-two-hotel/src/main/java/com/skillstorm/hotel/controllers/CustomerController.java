package com.skillstorm.hotel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.hotel.models.Customers;
import com.skillstorm.hotel.services.CustomerService;

/**
 * Controller class to send and receive HTTP Requests, which 
 * allow a web server to query the MySQL database, and uses 
 * the methods specified in the CustomerService class.
 * 
 * @author Todd Foreman
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping(path="/customers")
public class CustomerController {
	
	/**
	 * Auto wiring the service to allow methods to be used by a 
	 * CustomerService object.
	 */
	@Autowired
	private CustomerService service;

	
	/**
	 * Finds the customer based on the id specified in the url of 
	 * a Get request.
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Customers findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	/**
	 * Creates a new customer using the raw JSON sent to the servlet 
	 * using a Post request.
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  Customers create(@Valid @RequestBody Customers customer) {
		return service.save(customer);
	}
	
	/**
	 * Updates a customer based on the specified id in the url, 
	 * and the raw JSON sent to the servlet using a Put Request.
	 * 
	 * @param customer
	 * @param id
	 * @return
	 */
	@PutMapping("/{id}")
	public  Customers update(@Valid @RequestBody Customers customer, @PathVariable int id) {
		customer.setCustomerId(id);
		return service.save(customer);
	}

	/**
	 * Deletes a customer based on the id in the url of a Delete request.
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id){
		service.deleteById(id);
	}
}
