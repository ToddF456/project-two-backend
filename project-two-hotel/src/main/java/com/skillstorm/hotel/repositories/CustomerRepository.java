package com.skillstorm.hotel.repositories;

import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Customers;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer>{

	public Customers findByFirstNameAndLastName(String firstName, String lastName);
}
