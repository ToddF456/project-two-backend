package com.skillstorm.hotel.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.skillstorm.hotel.models.BeanNotValidDto;

/**
 * A class which handles exceptions that occur through the 
 * program, mainly to deal with invalid beans.
 * 
 * @author Todd Foreman
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * If a bean is invalid, this will return a new exception 
	 * message, as well as return a HTTP 400 code.
	 * @param e
	 * @return
	 */
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class) // This works similar to @AfterThrowing
	public BeanNotValidDto invalidBean(Exception e) {
		return new BeanNotValidDto(e.getMessage());
	}
}