package com.skillstorm.hotel.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class Reservations {

	@Id
	@Column(name = "reservation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;
	
	@NotBlank
	@JoinColumn(name = "room_id")
	private int roomId;
	
	@NotBlank
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
	
	public Reservations() {}

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

	public Reservations(int roomId, int customerId, String startDate, String endDate, int confirmationNumber) {
		super();
		this.roomId = roomId;
		this.customerId = customerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.confirmationNumber = confirmationNumber;
	}
	
	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	
	
	
	
	
	
}
