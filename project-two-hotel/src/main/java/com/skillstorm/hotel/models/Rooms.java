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
 * This is the models class for the rooms table in MySQL. 
 * It contains each of the variables within the rooms table, 
 * with the correct annotations to denote their respective 
 * table properties.
 * 
 * @author Todd Foreman
 *
 */
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
	
	@Positive
	@Column(name = "img_id")
	private int imgId;
	
	/**
	 * Basic constructor for the class.
	 */
	public Rooms() {}

	/**
	 * Constructor for each variable to be input in the parameter.
	 * @param roomId
	 * @param roomNumber
	 * @param type
	 * @param numBeds
	 * @param maxOccupancy
	 * @param price
	 * @param imgId
	 */
	public Rooms(int roomId, String roomNumber, String type, int numBeds, int maxOccupancy, int price, int imgId) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.type = type;
		this.numBeds = numBeds;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
		this.imgId = imgId;
	}

	/**
	 * Constructor that takes every variable aside from roomId in the parameter.
	 * @param roomNumber
	 * @param type
	 * @param numBeds
	 * @param maxOccupancy
	 * @param price
	 * @param imgId
	 */
	public Rooms(String roomNumber, String type, int numBeds, int maxOccupancy, int price, int imgId) {
		super();
		this.roomNumber = roomNumber;
		this.type = type;
		this.numBeds = numBeds;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
		this.imgId = imgId;
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
	 * Gets the room number.
	 * @return
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	
	/**
	 * Sets the room number.
	 * @param roomNumber
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * Retrieves the type of a room.
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type of a room.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the number of beds in a room
	 * @return
	 */
	public int getNumBeds() {
		return numBeds;
	}

	/**
	 * Sets the number of beds in a room
	 * @param numBeds
	 */
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	/**
	 * Retrieves the maximum amount of guests that can be in a room.
	 * @return
	 */
	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	/**
	 * Sets the maximum amount of guests that can be in a room.
	 * @param maxOccupancy
	 */
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	/**
	 * Gets the price of a room.
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets the price of a room.
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Retrieves the image ID of a room.
	 * @return
	 */
	public int getImgId() {
		return imgId;
	}

	/**
	 * Sets the image ID of a room.
	 * @param imgId
	 */
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
}
