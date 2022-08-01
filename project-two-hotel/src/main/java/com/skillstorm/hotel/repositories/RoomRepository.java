package com.skillstorm.hotel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Rooms;

/**
 * Repository class to take care of JDBC queries sent 
 * to MySQL for the rooms table. It extends the 
 * CrudRepository class to ensure all CRUD functionality
 * is automatically available.
 * 
 * @author Todd Foreman
 *
 */
@Repository
public interface RoomRepository extends CrudRepository<Rooms, Integer> {
	
	/**
	 * A native query to find rooms that do not have a specified
	 * start or end date reservation on the reservations table as 
	 * well as checking to see if the room can hold the specified 
	 * number of guests.
	 *  
	 * @param startDate
	 * @param endDate
	 * @param numGuests
	 * @return
	 */
	@Query(value = "SELECT * FROM rooms WHERE NOT EXISTS(SELECT * FROM reservations WHERE rooms.room_id = reservations.room_id AND ?1 < reservations.end_date AND ?2 > reservations.start_date) AND rooms.max_occupancy >= ?3", nativeQuery = true)
	public List<Rooms> findRoomsWithinDates(String startDate, String endDate, int numGuests);
	
}

/*
	This is the query to find rooms that do not have a reservation within 
	a date range and the amount of guests that can be in a room.
	
	SELECT *
	FROM rooms
	WHERE NOT EXISTS(SELECT * FROM reservations
	WHERE rooms.room_id = reservations.room_id 
	AND ?1 < reservations.end_date 
	AND ?2 > reservations.start_date)
	AND rooms.max_occupancy >= ?3;
*/