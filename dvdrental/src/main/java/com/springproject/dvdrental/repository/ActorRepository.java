package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>{

}
