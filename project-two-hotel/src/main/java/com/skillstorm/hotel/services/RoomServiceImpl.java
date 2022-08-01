package com.skillstorm.hotel.services;

import java.time.LocalDate;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.skillstorm.hotel.models.Rooms;
import com.skillstorm.hotel.repositories.RoomRepository;


@Service
@Primary
@Transactional
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository repository;
	
	@Override
	public List<Rooms> findAvailableByDates(String startDate, String endDate, int numGuests) {
		
		return repository.findRoomsWithinDates(startDate, endDate, numGuests);
	}

	@Override
	public List<Rooms> findAll() {
		return (List<Rooms>) repository.findAll();
	}

	@Override
	public Rooms save(Rooms room) {
		return repository.save(room);
	}

	@Override
	public Rooms update(Rooms room) {
		return repository.save(room);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}
	
}
