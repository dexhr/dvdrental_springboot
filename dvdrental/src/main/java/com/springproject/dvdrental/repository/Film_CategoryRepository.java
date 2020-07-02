package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.CompoundKeyFilmCategory;
import com.springproject.dvdrental.model.Film_Category;

@Repository
public interface Film_CategoryRepository extends JpaRepository<Film_Category, CompoundKeyFilmCategory>{

}
