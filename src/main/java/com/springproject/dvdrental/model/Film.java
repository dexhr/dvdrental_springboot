package com.springproject.dvdrental.model;

import java.time.Year;
import java.util.Date;	

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.springprojecft.dvdrental.utility.YearAttributeConverter;

@Entity
@Table
public class Film {
	@Id
	@GeneratedValue(generator = "film_generator")
	@SequenceGenerator(name="film_generator", sequenceName = "film_film_id_seq", allocationSize=1)
	@Column(name = "film_id")
	private int filmId;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "release_year", columnDefinition = "smallint")
	@Convert(converter = YearAttributeConverter.class)
	private Year year;
	@Column(name = "rental_duration")
	private int rentalDuration;
	@Column(name = "rental_rate")
	private long rentalRate;
	@Column(name = "length")
	private int length;
	@Column(name = "replacement_cost")
	private long replacementCost;
	@Column(name = "rating")
	private String rating;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@Column(name="special_features",length = 65535,columnDefinition="Text")
	private String specialFeatures;

//	//https://stackoverflow.com/questions/56274729/making-full-text-search-with-postgresql-and-hibernate-missing-type-for-tsvecto
	@Column(name = "fulltext", columnDefinition = "TEXT", nullable = false) 
	private String fulltext;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
//	
	public Film() {
		
	}
//
	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public long getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(long rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public long getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(long replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getFulltext() {
		return fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
}
