package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Film_Category;

public interface Film_CategoryService {
	List<Film_Category> getAllFilmCategory();
	void save(Film_Category filmCategory);
	Film_Category getFilmCategoryByIds(int filmId, int categoryId);
	void delete(int filmId, int categoryId);
}
