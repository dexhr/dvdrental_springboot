package com.springproject.dvdrental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(generator = "customer_generator")
	@SequenceGenerator(name="customer_generator", sequenceName = "customer_customer_id_seq", allocationSize=1)
	private int customerId;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "activebool")
	private boolean activeBool;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "last_update")
	private Date lastUpudate;
	@Column(name = "active")
	private int active;
	
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	public Customer() {
		
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActiveBool() {
		return activeBool;
	}

	public void setActiveBool(boolean activeBool) {
		this.activeBool = activeBool;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpudate() {
		return lastUpudate;
	}

	public void setLastUpudate(Date lastUpudate) {
		this.lastUpudate = lastUpudate;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
