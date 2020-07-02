package com.springproject.dvdrental.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.dvdrental.exception.ResourceNotFoundException;
import com.springproject.dvdrental.model.Country;
import com.springproject.dvdrental.service.CountryService;

@SpringBootApplication
@RestController
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/api/v1/countries")
	public List<Country> getCountries(){
		return countryService.getAllCountries();
	}
	
	@GetMapping("/countries/{id}")
	public ResponseEntity<Country> getCountry(@PathVariable(value = "id") Integer id) 
			throws ResourceNotFoundException {
		
		try {
			Country country = countryService.getCountryById(id);
			return ResponseEntity.ok().body(country);
		}
		catch(Exception ex){
			throw new ResourceNotFoundException("Resource not found");
			//return new ResponseEntity("Can't found the country", HttpStatus.OK);
		}
	}
	
	@PostMapping("/countries")
	public Country insert(@RequestBody Country country) {
		return countryService.saveCountry(country);
	}
	
	@PutMapping("/countries/{id}")
	public ResponseEntity<Country> updateCountry(@PathVariable(value = "id") Integer id,
			@RequestBody Country countryDetails){
		Date date = new Date();
		Country country = countryService.getCountryById(id);
		country.setCountry(countryDetails.getCountry());
		country.setLastUpdate(date);
		countryService.saveCountry(country);
		return ResponseEntity.ok().body(country);
	}
	
	@DeleteMapping("/countries/{id}")
	public Map<String, Boolean> deleteCountry(@PathVariable(value = "id") Integer id){
		countryService.deleteCountry(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", true);
		return response;
	}
}
