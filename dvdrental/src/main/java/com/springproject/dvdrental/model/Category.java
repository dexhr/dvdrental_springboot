package com.springproject.dvdrental.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Category {
	@Id
	@GeneratedValue(generator = "category_generator")
	@SequenceGenerator(name="category_generator", sequenceName = "category_category_id_seq", allocationSize=1)
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "name")
	private String name;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@OneToMany(mappedBy = "category")
    public Set<Film_Category> filmCategory;
	
	public Category() {
		
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set<Film_Category> getFilmCategory() {
		return filmCategory;
	}

	public void setFilmCategory(Set<Film_Category> filmCategory) {
		this.filmCategory = filmCategory;
	}
	
	
	
}
