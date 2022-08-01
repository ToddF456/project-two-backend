package com.skillstorm.hotel.models;

import java.util.Date;


/**
 * This class ensures that if a bean is not valid, it allows it to be handled by the GlobalExceptionHandler.
 * 
 * @author Todd Foreman
 *
 */
public class BeanNotValidDto {

	private Date timestamp;
	private String message;
	
	/**
	 * Constructor which specifies that date in which the invalid bean occurred.
	 */
	public BeanNotValidDto() {
		this.timestamp = new Date();
	}
	
	/**
	 * Constructor takes a message as a parameter if a message 
	 * is supplied, and contains the date, as it uses the this() method.
	 * @param message
	 */
	public BeanNotValidDto(String message) {
		this();
		this.message = message;
	}

	/**
	 * Gets the date when the invalid bean occurred.
	 * 
	 * @return
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the date when the invalid bean occurred.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Retrieves the message supplied to the invalid bean.
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message supplied to the invalid bean.
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}