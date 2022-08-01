package com.skillstorm.hotel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Reservations;

/**
 * Repository class to take care of JDBC queries sent 
 * to MySQL for the reservations table. It extends the 
 * CrudRepository class to ensure all CRUD functionality
 * is automatically available.
 * 
 * @author Todd Foreman
 *
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservations, Integer> {

	/**
	 * Query that finds a reservation using the confirmation number.
	 * @param confirmationNumber
	 * @return
	 */
	public Reservations findByConfirmationNumber(int confirmationNumber);
}
