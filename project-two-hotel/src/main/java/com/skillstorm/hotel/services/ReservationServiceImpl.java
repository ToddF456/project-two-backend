package com.skillstorm.hotel.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.hotel.models.Reservations;
import com.skillstorm.hotel.repositories.ReservationRepository;

/**
 * Service class for reservations which implements the methods in 
 * the ReservationService interface, and executes the queries using 
 * the ReservationRepository interface. Each CRUD functionality is 
 * available using the respective method, as well as any methods 
 * stated within the ReservationRepository interface.
 * 
 * @author Todd Foreman
 *
 */
@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	/**
	 * Auto wiring the repository to allow queries to be executed using a ReservationRepository object.
	 */
	@Autowired
	private ReservationRepository repository;

	/**
	 * Find a reservation based on the reservation ID.
	 */
	@Override
	public Reservations findByConfirmation(int confirmation) {
		return repository.findByConfirmationNumber(confirmation);
	}

	/**
	 * Creates a new reservation.
	 */
	@Override
	public Reservations save(Reservations reservation) {
		return repository.save(reservation);
	}

	/**
	 * Updates a reservation.
	 */
	@Override
	public Reservations update(Reservations reservation) {
		return repository.save(reservation);
	}
	
	/**
	 * Deletes a reservation based on the reservation ID specified.
	 */
	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
