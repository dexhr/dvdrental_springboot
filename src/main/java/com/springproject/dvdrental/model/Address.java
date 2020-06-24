package com.springproject.dvdrental.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(generator = "address_generator")
	@SequenceGenerator(name = "address_generator", sequenceName = "address_address_id_seq")
	@Column(name = "address_id")
	private int addressId;
	@Column(name = "address")
	private String address;
	@Column(name = "address2")
	private String address2;
	@Column(name = "district")
	private String district;
	@Column(name = "postal_code")
	private String postaCode;
	@Column(name = "phone")
	private String phone;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@OneToMany(mappedBy="address")
    private Set<Staff> listaStaff;
	
	public Address() {
		
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(String postaCode) {
		this.postaCode = postaCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}


}
