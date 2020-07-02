package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{

}
