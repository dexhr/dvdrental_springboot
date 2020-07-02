package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.City;

public interface CityService {
	List<City> getAllCities();
	City saveCity(City city);
	City getCityById(int id);
	void deleteCity(int id);
}
