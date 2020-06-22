package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.dvdrental.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
