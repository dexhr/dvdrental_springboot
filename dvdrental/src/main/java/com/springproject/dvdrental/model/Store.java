package com.springproject.dvdrental.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Store {
	@Id
	@GeneratedValue(generator = "store_generator")
	@SequenceGenerator(name="store_generator", sequenceName = "store_store_id_seq", allocationSize=1)
	@Column(name="store_id")
	private int storeId;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_staff_id")
	private Staff staff;
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	public Store() {
		
	}
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
