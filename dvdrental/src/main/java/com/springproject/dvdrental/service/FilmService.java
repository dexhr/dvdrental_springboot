package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Film;

public interface FilmService {
	List<Film> getAllFilms();
	Film saveFilm(Film film);
	Film getFilmById(int id);
	void deleteFilm(int id);
}
