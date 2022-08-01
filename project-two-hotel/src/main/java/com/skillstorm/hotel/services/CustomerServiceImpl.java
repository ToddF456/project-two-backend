package com.skillstorm.hotel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.hotel.models.Customers;
import com.skillstorm.hotel.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customers findById(int id) {
		Optional<Customers> customer = repository.findById(id);
		return customer.isPresent() ? customer.get() : null;
	}

	@Override
	public Customers save(Customers customer) {
		return repository.save(customer);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

}
