package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
