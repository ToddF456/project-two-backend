package com.skillstorm.hotel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * This is the models class for the reservations table in MySQL. 
 * It contains each of the variables within the reservations table, 
 * with the correct annotations to denote their respective 
 * table properties.
 * 
 * @author Todd Foreman
 *
 */
@Entity
@Table(name= "reservations")
public class Reservations {

	@Id
	@Column(name = "reservation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;
	
	@Positive
	@JoinColumn(name = "room_id")
	private int roomId;
	
	@Positive
	@JoinColumn(name = "customer_id")
	private int customerId;
	
	@NotBlank
	@Column(name = "start_date")
	private String startDate;
	
	@NotBlank
	@Column(name = "end_date")
	private String endDate;
	
	@Positive
	@Column(name = "confirmation_number")
	private int confirmationNumber;
	
	/**
	 * Basic constructor for the class.
	 */
	public Reservations() {}

	/**
	 * Constructor for each variable to be input in the parameter.
	 * @param reservationId
	 * @param roomId
	 * @param customerId
	 * @param startDate
	 * @param endDate
	 * @param confirmationNumber
	 */
	public Reservations(int reservationId, int roomId, int customerId, String startDate, String endDate,
			int confirmationNumber) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.confirmationNumber = confirmationNumber;
	}

	/**
	 * Constructor that takes every variable aside from reservationId in the parameter.
	 * @param roomId
	 * @param customerId
	 * @param startDate
	 * @param endDate
	 * @param confirmationNumber
	 */
	public Reservations(int roomId, int customerId, String startDate, String endDate, int confirmationNumber) {
		super();
		this.roomId = roomId;
		this.customerId = customerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.confirmationNumber = confirmationNumber;
	}
	
	/**
	 * Gets the reservation ID.
	 * @return
	 */
	public int getReservationId() {
		return reservationId;
	}

	/**
	 * Sets the reservation ID.
	 * @param reservationId
	 */
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * Retrieves the room ID.
	 * @return
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * Sets the room ID.
	 * @param roomId
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * Gets the customer ID.
	 * @return
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the customer ID.
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * Retrieves the starting date for the reservation.
	 * @return
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the starting date for the reservation.
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the ending date of the reservation.
	 * @return
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the ending date of the reservation.
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Retrieves the confirmation number of the reservation.
	 * @return
	 */
	public int getConfirmationNumber() {
		return confirmationNumber;
	}

	/**
	 * Sets the confirmation number of the reservation.
	 * @param confirmationNumber
	 */
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
}
