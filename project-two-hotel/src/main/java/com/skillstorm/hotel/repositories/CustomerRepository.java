package com.skillstorm.hotel.repositories;

import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Customers;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository class to take care of JDBC queries sent 
 * to MySQL for the customers table. It extends the 
 * CrudRepository class to ensure all CRUD functionality
 * is automatically available.
 * 
 * @author Todd Foreman
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer>{

	/**
	 * Queries the database by the first and last name of a customer.
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public Customers findByFirstNameAndLastName(String firstName, String lastName);
}
