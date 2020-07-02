package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Actor;

public interface ActorService {
	List<Actor> getAllActors();
	Actor saveActor(Actor actor);
	Actor getActorById(int id);
	void deleteActor(int id);
}
