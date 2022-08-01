package com.skillstorm.hotel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

/**
 * This is the models class for the customers table in MySQL. 
 * It contains each of the variables within the customers table, 
 * with the correct annotations to denote their respective 
 * table properties.
 * 
 * @author Todd Foreman
 *
 */
@Entity
@Table(name="customers")
public class Customers {

	@Id
	@JoinColumn(name= "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@NotBlank
	@Column(name= "first_name")
	private String firstName;
	
	@NotBlank
	@Column(name= "last_name")
	private String lastName;
	
	@NotBlank
	@Email
	@Column(name= "email")
	private String email;
	
	@Column(name= "phone_number")
	@Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$")
	private String phoneNumber;
	
	@Positive
	@Column(name= "num_guests")
	private int numGuests;
	
	/**
	 * Basic constructor for the class.
	 */
	public Customers() {}

	/**
	 * Constructor for each variable to be input in the parameter.
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param numGuests
	 */
	public Customers(int customerId, String firstName, String lastName, String email, String phoneNumber, int numGuests) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.numGuests = numGuests;
	}

	/**
	 * Constructor that takes every variable aside from customerId in the parameter.
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param numGuests
	 */
	public Customers(String firstName, String lastName, String email, String phoneNumber, int numGuests) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.numGuests = numGuests;
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
	 * Retrieves the first name of a customer.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of a customer.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of a customer.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of a customer.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Retrieves the email of a customer.
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of a customer.
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone number of a customer.
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number of a customer.
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Retrieves the number of guests.
	 * @return
	 */
	public int getNumGuests() {
		return numGuests;
	}

	/**
	 * Sets the number of guests.
	 * @param numGuests
	 */
	public void setNumGuests(int numGuests) {
		this.numGuests = numGuests;
	}
}
