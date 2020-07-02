package com.springproject.dvdrental.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.dvdrental.exception.ResourceNotFoundException;
import com.springproject.dvdrental.model.Actor;
import com.springproject.dvdrental.service.ActorService;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ActorController {
	@Autowired
	ActorService actorService; 
	
	@GetMapping("/actors")
	public List<Actor> getActors(){
		return actorService.getAllActors();
	}
	
	@GetMapping("/countries")
	public ResponseEntity<Actor> getActor(@PathVariable(value = "id") Integer id) 
			throws ResourceNotFoundException{
		try {
			Actor actor = actorService.getActorById(id);
			return ResponseEntity.ok().body(actor);
		}catch(Exception ex) {
			throw new ResourceNotFoundException("Actor not found");
		}
	}
	
	@PostMapping("/countries/{id}")
	public ResponseEntity<Actor> updateCountry(@PathVariable(value = "id") Integer id,
			@RequestBody Actor actorDetails){
		Date date = new Date();
		Actor actor = actorService.getActorById(id);
		actor.setFirstName(actorDetails.getFirstName());
		actor.setLastName(actor.getLastName());
		return ResponseEntity.ok().body(actor);
	}
	
	@DeleteMapping("/countries")
	public boolean deleteCountry(Integer id) {
		actorService.deleteActor(id);
		return true;
	}
	
}
