package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Actor;
import com.springproject.dvdrental.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService{

	@Autowired
	private ActorRepository actorRepository;
	
	@Override
	public List<Actor> getAllActors() {
		// TODO Auto-generated method stub
		List<Actor> listActors = actorRepository.findAll();
		return listActors;
	}

	@Override
	public Actor saveActor(Actor actor) {
		// TODO Auto-generated method stub
		return actorRepository.save(actor);
	}

	@Override
	public Actor getActorById(int id) {
		// TODO Auto-generated method stub
		Optional<Actor> optional = actorRepository.findById(id);
		Actor actor = null;
		if(optional.isPresent()) {
			actor = optional.get();
		}
		return actor;
	}

	@Override
	public void deleteActor(int id) {
		// TODO Auto-generated method stub
		actorRepository.delete(getActorById(id));
	}

}
