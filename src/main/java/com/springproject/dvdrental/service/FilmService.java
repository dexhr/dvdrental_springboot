package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Film;

public interface FilmService {
	List<Film> getAllFilms();
	void saveFilm(Film film);
	Film getFilmById(int id);
	void deleteFilm(int id);
}
