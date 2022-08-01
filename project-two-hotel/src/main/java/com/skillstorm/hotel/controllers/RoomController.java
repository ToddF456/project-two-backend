package com.skillstorm.hotel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.hotel.models.Rooms;
import com.skillstorm.hotel.services.RoomService;


/**
 * Controller class to send and receive HTTP Requests, which 
 * allow a web server to query the MySQL database, and uses 
 * the methods specified in the RoomService class.
 * 
 * @author Todd Foreman
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/rooms")
public class RoomController {

	/**
	 * Auto wiring the service to allow methods to be used by a RoomService object.
	 */
	@Autowired
	private RoomService service;
	
	/**
	 * Finds all of the rooms using a Get request.
	 * 
	 * @return
	 */
	@GetMapping
	public List<Rooms> findAll() {
		return service.findAll();
	}
	
	/**
	 * Finds all of the rooms that do not have a reservation 
	 * within a date range and can fit the specified number 
	 * of guests in the url using a Get request.
	 * 
	 * @param startDate
	 * @param endDate
	 * @param numGuests
	 * @return
	 */
	@GetMapping("/dates")
	public List<Rooms> findAvailableByDates(@RequestParam String startDate, 
			@RequestParam String endDate, @RequestParam int numGuests) {
		return service.findAvailableByDates(startDate, endDate, numGuests);
	}
}
