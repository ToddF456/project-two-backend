package com.skillstorm.hotel.services;

import com.skillstorm.hotel.models.Customers;


public interface CustomerService {
	
	Customers findById(int id);
	Customers findByName(String firstName, String lastName);
	Customers save(Customers customer);
	void deleteById(int id);
	
}
