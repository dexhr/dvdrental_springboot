package com.springproject.dvdrental.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springproject.dvdrental.model.Actor;
import com.springproject.dvdrental.model.Address;
import com.springproject.dvdrental.model.Category;
import com.springproject.dvdrental.model.City;
import com.springproject.dvdrental.model.Country;
import com.springproject.dvdrental.model.Film;
import com.springproject.dvdrental.model.Film_Category;
import com.springproject.dvdrental.model.Language;
import com.springproject.dvdrental.model.Staff;
import com.springproject.dvdrental.model.Store;
import com.springproject.dvdrental.service.ActorService;
import com.springproject.dvdrental.service.AddressService;
import com.springproject.dvdrental.service.CategoryService;
import com.springproject.dvdrental.service.CityService;
import com.springproject.dvdrental.service.CountryService;
import com.springproject.dvdrental.service.FilmService;
import com.springproject.dvdrental.service.Film_CategoryService;
import com.springproject.dvdrental.service.LanguageService;
import com.springproject.dvdrental.service.StaffService;
import com.springproject.dvdrental.service.StoreService;

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
	@Autowired
	private AddressService addressService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private FilmService filmService;
	@Autowired
	private Film_CategoryService filmCatService;
	@Autowired
	private StoreService storeService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		//Countries
				for(Country c : countryService.getAllCountries()) {
					System.out.println("Imprime: " + c.getCountry() + "date: ");
				}
				
				//Cities
				/*
				Date date = new Date();
				City newCity = new City();
				newCity.setCity("ArsNova");
				newCity.setLastUpdate(date);
				newCity.setCountry(countryService.getCountryById(1));
				
				cityService.saveCity(newCity);
				*/
				
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
				
				for(Address add : addressService.getAllAddresses()) {
					System.out.println("Address: " + add.getAddress() + " - " + add.getCity().getCity());
				}
				
				for(Staff st : staffService.getAllStaff()) {
					System.out.println("Staff: " + st.getFirstName() + " " + st.getLastName() + " COUNTRY: " + st.getAddress().getCity().getCountry().getCountry());
				}
				
				for(Film film : filmService.getAllFilms()) {
					System.out.println("ID: " + film.getFilmId() + film.getLanguage().getName() + film.getYear() + film.getSpecialFeatures() + film.getRating() + film.getFulltext());
				}
				
				for(Film_Category fcr : filmCatService.getAllFilmCategory()) {
					System.out.println("FCAT: " + fcr.getLastUpdate() + fcr.getFilm().getTitle() + fcr.getCategory().getName());
				}
				
				for(Store st : storeService.getAllStores()) {
					System.out.print("Store: " + st.getStoreId() + st.getStaff().getFirstName() + st.getAddress().getDistrict());
				}
				
				System.out.println("Cantidad de actores: " + actorService.getAllActors().size());
				return "index";
	}
}
