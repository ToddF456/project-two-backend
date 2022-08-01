package com.skillstorm.hotel.controllers;

import java.util.Set;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.hotel.models.Reservations;
import com.skillstorm.hotel.services.ReservationService;


/**
 * Controller class to send and receive HTTP Requests, which 
 * allow a web server to query the MySQL database, and uses 
 * the methods specified in the ReservationService class.
 * 
 * @author Todd Foreman
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/reservations")
public class ReservationController {
	
	/**
	 * Auto wiring the service to allow methods to be used by a ReservationService object.
	 */
	@Autowired
	private ReservationService service;
	
	/**
	 * Finds a reservation based on the confirmation number sent in 
	 * the url of a Get request.
	 * @param confirmation
	 * @return
	 */
	@GetMapping("/{confirmation}") 
	public Reservations findByConfirmation(@PathVariable int confirmation) {
		return service.findByConfirmation(confirmation);
	}
	
	/**
	 * Creates a new reservation using the raw JSON sent to the servlet 
	 * using a Post request.
	 * 
	 * @param reservation
	 * @return
	 */
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Reservations create(@Valid @RequestBody Reservations reservation) {
		return service.save(reservation);
	}
	
	/**
	 * Updates a reservation based on the specified id in the url, 
	 * and the raw JSON sent to the servlet using a Put Request.
	 * 
	 * @param reservation
	 * @return
	 */
	@PutMapping()
	public Reservations update(@Valid @RequestBody Reservations reservation) {
		return service.save(reservation);
	}

	/**
	 * Deletes a reservation based on the id in the url of a Delete request.
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id){
		service.deleteById(id);
	}
}
