package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.City;
import com.springproject.dvdrental.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return cityRepository.findAll(); 
	}

	@Override
	public void saveCity(City city) {
		// TODO Auto-generated method stub
		cityRepository.save(city);
	}

	@Override
	public City getCityById(int id) {
		// TODO Auto-generated method stub
		Optional<City> optional = cityRepository.findById(id);
		City city = null;
		if(optional.isPresent()) {
			city = optional.get();
		}
		return city;
	}

	@Override
	public void deleteCity(int id) {
		// TODO Auto-generated method stub
		cityRepository.delete(getCityById(id));
	}
	

}
