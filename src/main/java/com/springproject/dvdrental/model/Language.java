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
public class Language {
	@Id
	@GeneratedValue(generator = "language_generator")
	@SequenceGenerator(name="language_generator", sequenceName = "language_language_id_seq", allocationSize=1)
	@Column(name = "language_id")
	private int languageId;
	@Column(name = "name")
	private String name;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	@OneToMany(mappedBy = "language")
	private Set<Film> listFilms;
	
	public Language() {
		
	}
	
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
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
	
}
