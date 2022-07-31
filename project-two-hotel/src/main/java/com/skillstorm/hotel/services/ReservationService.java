package com.skillstorm.hotel.services;

import com.skillstorm.hotel.models.Reservations;

public interface ReservationService {

	Reservations findByConfirmation(int confirmation);
	Reservations save(Reservations reservation);
	Reservations update(Reservations reservation);
	void deleteById(int id);
	
}
