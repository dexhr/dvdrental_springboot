package com.springproject.dvdrental.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Country {
	@Id
	@GeneratedValue(generator = "country_generator")
	@SequenceGenerator(name="country_generator", sequenceName = "country_country_id_seq", allocationSize=1)
	@Column(name = "country_id")
	private int countryId;
	@Column(name = "country")
	private String country;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@OneToMany(mappedBy="country")
	private Set<City> ciudades;
	
	public Country() {
		
	}
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
