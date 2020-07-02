package com.springproject.dvdrental.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompoundKeyFilmCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int film_id; 
	private int category_id;
	
	public CompoundKeyFilmCategory() {
		
	}
	
	public CompoundKeyFilmCategory(int film_id, int category_id) {
		this.film_id = film_id;
		this.category_id = category_id;
	}
	
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
}
