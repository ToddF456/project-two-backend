package com.skillstorm.hotel.services;

import java.util.List;

import com.skillstorm.hotel.models.Rooms;

public interface RoomService {

	List<Object[]> findAvailableByDates();
	List<Rooms> findAll();
	Rooms save(Rooms room);
	Rooms update(Rooms room);
	void deleteById(int id);
	
	
}
