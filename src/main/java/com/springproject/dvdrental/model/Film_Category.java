package com.springproject.dvdrental.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Film_Category {
	@EmbeddedId
	CompoundKeyFilmCategory ckFilmCategory;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "film_id")
//	@MapsId("filmId")
//	private Film film;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "category_id") 
//	@MapsId("categoryId")
//	private Category category;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
	@MapsId("filmId")
	private Film film;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id") 
	@MapsId("categoryId")
	private Category category;
	
	@Column(name = "last_update")
	private Date lastUpdate;

	public CompoundKeyFilmCategory getCkFilmCategory() {
		return ckFilmCategory;
	}

	public void setCkFilmCategory(CompoundKeyFilmCategory ckFilmCategory) {
		this.ckFilmCategory = ckFilmCategory;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
