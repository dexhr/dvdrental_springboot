package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Category;

public interface CategoryService {
	List<Category> getAllCategories();
	void saveCategory(Category category);
	Category getCategoryById(int id);
	void deleteCategory(int id);
}
