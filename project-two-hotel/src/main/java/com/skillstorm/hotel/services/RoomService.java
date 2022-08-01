package com.skillstorm.hotel.services;

import java.util.List;

import com.skillstorm.hotel.models.Rooms;

/**
 * An interface class which allows the RoomServiceImpl class to function.
 * 
 * @author Todd Foreman
 *
 */
public interface RoomService {

	List<Rooms> findAvailableByDates(String startDate, String endDate, int numGuests);
	List<Rooms> findAll();
	Rooms save(Rooms room);
	Rooms update(Rooms room);
	void deleteById(int id);
	
}
