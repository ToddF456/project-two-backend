package com.skillstorm.hotel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Reservations;

@Repository
public interface ReservationRepository extends CrudRepository<Reservations, Integer> {

	public Reservations findByConfirmationNumber(int confirmationNumber);
}
