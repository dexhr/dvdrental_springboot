package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Actor;

public interface ActorService {
	List<Actor> getAllActors();
	void saveActor(Actor actor);
	Actor getActorById(int id);
	void deleteActorById(int id);
}
