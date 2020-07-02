package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Film;
import com.springproject.dvdrental.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmRepository filmRepository;
	
	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();
	}

	@Override
	public Film saveFilm(Film film) {
		// TODO Auto-generated method stub
		return filmRepository.save(film);
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		Optional<Film> optional = filmRepository.findById(id);
		Film film = null;
		if(optional.isPresent()) {
			film = optional.get();
		}
		return film;
	}

	@Override
	public void deleteFilm(int id) {
		// TODO Auto-generated method stub
		filmRepository.delete(getFilmById(id));
	}

}
