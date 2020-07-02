package com.springproject.dvdrental.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Country;
import com.springproject.dvdrental.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	@Override
	public Country saveCountry(Country country) {
		// TODO Auto-generated method stub
		//countryRepository.save(country);
		Date lastUpdate = new Date();
		country.setLastUpdate(lastUpdate);
		return countryRepository.save(country);
	}

	@Override
	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		Optional<Country> optional = countryRepository.findById(id);
		Country country= null;
		if(optional.isPresent()) {
			country = optional.get();
		}
		else {
			throw new RuntimeException("Not found for id " + id);
		}
		return country;
	}

	@Override
	public void deleteCountry(int id) {
		// TODO Auto-generated method stub
		countryRepository.delete(getCountryById(id));
	}
	
}
