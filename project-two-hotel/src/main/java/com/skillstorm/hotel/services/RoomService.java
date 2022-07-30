package com.skillstorm.hotel.services;

import java.time.LocalDate;
import java.util.List;

import com.skillstorm.hotel.models.Rooms;

public interface RoomService {

	List<Rooms> findAvailableByDates(LocalDate startDate, LocalDate endDate, int numGuests);
	List<Rooms> findAll();
	Rooms save(Rooms room);
	Rooms update(Rooms room);
	void deleteById(int id);
	
	
}
