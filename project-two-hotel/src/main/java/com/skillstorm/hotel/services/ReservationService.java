package com.skillstorm.hotel.services;

import com.skillstorm.hotel.models.Reservations;

/**
 * An interface class which allows the ReservationsServiceImpl class to function.
 * 
 * @author Todd Foreman
 *
 */
public interface ReservationService {

	Reservations findByConfirmation(int confirmation);
	Reservations save(Reservations reservation);
	Reservations update(Reservations reservation);
	void deleteById(int id);
	
}
