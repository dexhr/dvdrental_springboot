package com.springproject.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Film_Category;
import com.springproject.dvdrental.repository.Film_CategoryRepository;

@Service
public class Film_CategoryServiceImpl implements Film_CategoryService{
	
	@Autowired
	Film_CategoryRepository filmCatRepository;
	
	@Override
	public List<Film_Category> getAllFilmCategory() {
		// TODO Auto-generated method stub
		return filmCatRepository.findAll();
	}

	@Override
	public void save(Film_Category filmCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Film_Category getFilmCategoryByIds(int filmId, int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int filmId, int categoryId) {
		// TODO Auto-generated method stub
		
	}
	
}
