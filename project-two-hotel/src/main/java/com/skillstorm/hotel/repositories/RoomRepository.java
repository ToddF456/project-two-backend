package com.skillstorm.hotel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.hotel.models.Rooms;

@Repository
public interface RoomRepository extends CrudRepository<Rooms, Integer> {
	
//	@Query(value = "select * from rooms left join reservations on rooms.room_id = reservations.room_id where reservations.room_id is Null", nativeQuery = true)
//	public List<Object[]> findRoomsWithinDates();
	
}
