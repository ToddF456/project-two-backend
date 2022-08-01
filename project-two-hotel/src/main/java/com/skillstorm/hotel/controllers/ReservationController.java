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


@RestController
@CrossOrigin("*")
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	@GetMapping("/{confirmation}") 
	public Reservations findByConfirmation(@PathVariable int confirmation) {
		return service.findByConfirmation(confirmation);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Reservations create(@Valid @RequestBody Reservations reservation) {
		return service.save(reservation);
	}
	
	@PutMapping()
	public Reservations update(@Valid @RequestBody Reservations reservation) {
		return service.save(reservation);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id){
		service.deleteById(id);
	}

}
