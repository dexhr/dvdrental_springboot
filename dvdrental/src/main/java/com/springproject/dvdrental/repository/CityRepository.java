package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
	
}
