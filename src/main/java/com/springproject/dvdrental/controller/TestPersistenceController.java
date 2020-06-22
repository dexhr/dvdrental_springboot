package com.springproject.dvdrental.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.dvdrental.model.Actor;
import com.springproject.dvdrental.model.Category;
import com.springproject.dvdrental.model.City;
import com.springproject.dvdrental.model.Country;
import com.springproject.dvdrental.model.Language;
import com.springproject.dvdrental.service.ActorService;
import com.springproject.dvdrental.service.CategoryService;
import com.springproject.dvdrental.service.CityService;
import com.springproject.dvdrental.service.CountryService;
import com.springproject.dvdrental.service.LanguageService;

@Controller
public class TestPersistenceController {

	@Autowired
	private CountryService countryService;
	@Autowired
	private LanguageService languageService;
	@Autowired
	private ActorService actorService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CityService cityService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		//Countries
				for(Country c : countryService.getAllCountries()) {
					System.out.println("Imprime: " + c.getCountry() + "date: ");
				}
				
				//Cities
				Date date = new Date();
				City newCity = new City();
				newCity.setCity("ArsNova");
				newCity.setLastUpdate(date);
				newCity.setCountry(countryService.getCountryById(1));
				
				cityService.saveCity(newCity);
				
				for(City city : cityService.getAllCities()){
					System.out.println("Ciudad: " + city.getCity() + ", Country: " + city.getCountry().getCountry() + ", Date: " + city.getLastUpdate());
				}
				
				//Actors
				for(Actor actor : actorService.getAllActors()) {
					System.out.println("Actor: " + actor.getFirstName() + " " + actor.getLastName());
				}
				
				//Categories
				for(Category cat: categoryService.getAllCategories()) {
					System.out.println("Category: " + cat.getName());
				}
				
				//Languages
				model.addAttribute("listCountries", countryService.getAllCountries());
				for(Language language : languageService.getAllLanguages()) {
					System.out.println("Imprime: " + language.getName() + "date: " + language.getLastUpdate());
				}
				
				System.out.println("Cantidad de actores: " + actorService.getAllActors().size());
				return "index";
	}
}
