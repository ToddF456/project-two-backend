package com.skillstorm.hotel.services;

import com.skillstorm.hotel.models.Customers;


/**
 * An interface class which allows the CustomerServiceImpl class to function.
 * 
 * @author Todd Foreman
 *
 */
public interface CustomerService {
	
	Customers findById(int id);
	Customers save(Customers customer);
	void deleteById(int id);
	
}
