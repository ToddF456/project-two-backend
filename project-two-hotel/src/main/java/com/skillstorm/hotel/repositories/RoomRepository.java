package com.skillstorm.hotel.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Rooms;

@Repository
public interface RoomRepository extends CrudRepository<Rooms, Integer> {
	
	@Query(value = "SELECT * FROM rooms WHERE NOT EXISTS(SELECT * FROM reservations WHERE rooms.room_id = reservations.room_id AND ?1 <= reservations.end_date AND ?2 >= reservations.start_date) AND rooms.max_occupancy >= ?3", nativeQuery = true)
	public List<Rooms> findRoomsWithinDates(String startDate, String endDate, int numGuests);
	
}


//This is the query to find rooms that do not have a reservation within a date range and the amount of guests that can be in a room.
//SELECT *
//FROM rooms
//WHERE NOT EXISTS(SELECT * FROM reservations
//WHERE rooms.room_id = reservations.room_id 
//AND '2022-07-01' <= reservations.end_date 
//AND '2022-07-03' >= reservations.start_date)
//AND rooms.max_occupancy >= 4;