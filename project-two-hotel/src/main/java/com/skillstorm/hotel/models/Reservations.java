package com.skillstorm.hotel.models;

import java.sql.Date;
//import java.time.LocalDate; possible use for this. waiting for proper hibernate lesson.

public class Reservations {

	private int reservationId;
	private int roomId;
	private int customerId;
	private Date startDate;
	private Date endDate;
	private int confirmationNumber;
	
	public Reservations() {}

	public Reservations(int reservationId, int roomId, int customerId, Date startDate, Date endDate,
			int confirmationNumber) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.confirmationNumber = confirmationNumber;
	}

	public Reservations(int roomId, int customerId, Date startDate, Date endDate, int confirmationNumber) {
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	
	
	
	
	
	
}
