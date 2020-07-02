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
public class City {
	@Id
	@GeneratedValue(generator = "city_generator")
	@SequenceGenerator(name="city_generator", sequenceName = "city_city_id_seq", allocationSize=1)
	@Column(name="city_id")
	private int cityId;
	@Column(name="city")
	private String city;
	@Column(name="last_update")
	private Date lastUpdate;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
