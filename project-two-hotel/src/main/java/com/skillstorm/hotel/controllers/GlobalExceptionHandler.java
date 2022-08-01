package com.skillstorm.hotel.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.skillstorm.hotel.models.BeanNotValidDto;

@RestControllerAdvice
public class GlobalExceptionHandler {

	// Think of the class as a try block around every controller in your app
	// This ExceptionHandler is a catch block specific for MethodArgumentNotValidException
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class) // This works similar to @AfterThrowing
	public BeanNotValidDto invalidBean(Exception e) {
		return new BeanNotValidDto(e.getMessage());
	}
}