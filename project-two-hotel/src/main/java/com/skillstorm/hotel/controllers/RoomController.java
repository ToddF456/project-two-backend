package com.skillstorm.hotel.controllers;

import java.time.LocalDate;
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



@RestController
@CrossOrigin("*")
@RequestMapping("/rooms")
public class RoomController {

//	@Autowired
//	private RoomService service;
//	
//	@GetMapping
//	public List<Rooms> findAll() {
//		return service.findAll();
//	}
//	
//	@GetMapping("/dates")
//	public List<Rooms> findAvailableByDates(@RequestParam LocalDate startDate, 
//			@RequestParam LocalDate endDate) {
//		return service.findAvailableByDates(startDate, endDate);
//	}
}
