package com.skillstorm.hotel.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.skillstorm.hotel.models.Rooms;
import com.skillstorm.hotel.repositories.RoomRepository;

/**
 * Service class for customers which implements the methods in 
 * the RoomService interface, and executes the queries using 
 * the RoomRepository interface. Each CRUD functionality is 
 * available using the respective method, as well as any methods 
 * stated within the RoomRepository interface.
 * 
 * @author Todd Foreman
 *
 */
@Service
@Primary
@Transactional
public class RoomServiceImpl implements RoomService {

	/**
	 * Auto wiring the repository to allow queries to be executed using a RoomRepository object.
	 */
	@Autowired
	private RoomRepository repository;
	
	/**
	 * Find rooms based on the specified start date, end date, and number of guests.
	 */
	@Override
	public List<Rooms> findAvailableByDates(String startDate, String endDate, int numGuests) {
		return repository.findRoomsWithinDates(startDate, endDate, numGuests);
	}

	/**
	 * Finds all of the listed rooms.
	 */
	@Override
	public List<Rooms> findAll() {
		return (List<Rooms>) repository.findAll();
	}

	/**
	 * Creates a room.
	 */
	@Override
	public Rooms save(Rooms room) {
		return repository.save(room);
	}

	/**
	 * Updates a room.
	 */
	@Override
	public Rooms update(Rooms room) {
		return repository.save(room);
	}

	/**
	 * Deletes a room by the specified room ID.
	 */
	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
