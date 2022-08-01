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

@Entity
@Table(name = "rooms")
public class Rooms {

	@Id
	@JoinColumn(name = "room_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	
	@NotBlank
	@Column(name = "room_number")
	private String roomNumber;
	
	@NotBlank
	@Column(name = "room_type")
	private String type;
	
	@Positive
	@Column(name = "num_beds")
	private int numBeds;
	
	@Positive
	@Column(name = "max_occupancy")
	private int maxOccupancy;
	
	@Positive
	@Column(name = "price")
	private int price;
	
	public Rooms() {}

	public Rooms(int roomId, String roomNumber, String type, int numBeds, int maxOccupancy, int price) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.type = type;
		this.numBeds = numBeds;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
	}

	public Rooms(String roomNumber, String type, int numBeds, int maxOccupancy, int price) {
		super();
		this.roomNumber = roomNumber;
		this.type = type;
		this.numBeds = numBeds;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
