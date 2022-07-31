package com.skillstorm.hotel.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.hotel.models.Reservations;
import com.skillstorm.hotel.repositories.ReservationRepository;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository repository;

	@Override
	public Reservations findByConfirmation(int confirmation) {
		return repository.findByConfirmationNumber(confirmation);
		
	}

	@Override
	public Reservations save(Reservations reservation) {
		return repository.save(reservation);
	}

	@Override
	public Reservations update(Reservations reservation) {
		return repository.save(reservation);
	}
	
	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	
}
