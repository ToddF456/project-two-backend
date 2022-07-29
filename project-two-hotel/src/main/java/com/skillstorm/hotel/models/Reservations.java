package com.skillstorm.hotel.models;


import java.time.LocalDate;

public class Reservations {

	private int reservationId;
	private int roomId;
	private int customerId;
	private LocalDate startDate;
	private LocalDate endDate;
	private int confirmationNumber;
	
	public Reservations() {}

	public Reservations(int reservationId, int roomId, int customerId, LocalDate startDate, LocalDate endDate,
			int confirmationNumber) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.confirmationNumber = confirmationNumber;
	}

	public Reservations(int roomId, int customerId, LocalDate startDate, LocalDate endDate, int confirmationNumber) {
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	
	
	
	
	
	
}
