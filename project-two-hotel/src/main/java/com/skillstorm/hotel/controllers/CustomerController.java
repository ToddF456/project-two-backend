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

@RestController
@CrossOrigin("*")
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	
	@GetMapping("/{id}")
	public Customers findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@GetMapping
	public Customers findByName(@RequestParam String firstName, @RequestParam String LastName) {
		return service.findByName(firstName, LastName);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  Customers create(@Valid @RequestBody Customers customer) {
		return service.save(customer);
	}
	
	@PutMapping("/{id}")
	public  Customers update(@Valid @RequestBody Customers customer, @PathVariable int id) {
		customer.setId(id);
		return service.save(customer);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id){
		service.deleteById(id);
	}
}
