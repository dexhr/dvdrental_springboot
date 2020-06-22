package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Country;

public interface CountryService {
	List<Country> getAllCountries();
	void saveCountry(Country country);
	Country getCountryById(int id);
	void deleteCountry(int id);
}
