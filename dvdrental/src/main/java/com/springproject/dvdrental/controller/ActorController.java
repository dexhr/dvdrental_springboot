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
@CrossOrigin(origins = "http://localhost:4200")
public class ActorController {
	@Autowired
	ActorService actorService; 
	
	@GetMapping("api/v1/actors")
	public List<Actor> getActors(){
		return actorService.getAllActors();
	}
	
	@GetMapping("/actors/{id}")
	public ResponseEntity<Actor> getActor(@PathVariable(value = "id") Integer id) 
			throws ResourceNotFoundException{
		try {
			Actor actor = actorService.getActorById(id);
			return ResponseEntity.ok().body(actor);
		}catch(Exception ex) {
			//throw new ResourceNotFoundException("Actor not found");
			throw new ResourceNotFoundException("Actor no encontrado");
		}
	}
	
	@DeleteMapping("/actors")
	public boolean deleteCountry(Integer id) {
		actorService.deleteActor(id);
		System.out.println("Borrando actor");
		return true;
	}
	
}
