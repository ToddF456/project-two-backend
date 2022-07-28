package com.skillstorm.hotel.models;

public class Rooms {

	private int roomId;
	private String roomNumber;
	private String type;
	private int maxOccupancy;
	private int price;
	
	public Rooms() {}

	public Rooms(int roomId, String roomNumber, String type, int maxOccupancy, int price) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.type = type;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
	}

	public Rooms(String roomNumber, String type, int maxOccupancy, int price) {
		super();
		this.roomNumber = roomNumber;
		this.type = type;
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
