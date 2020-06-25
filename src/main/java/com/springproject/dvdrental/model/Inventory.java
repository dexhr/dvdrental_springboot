package com.springproject.dvdrental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Inventory {
	@Id
	@GeneratedValue(generator = "inventory_generator")
	@SequenceGenerator(name="inventory_generator", sequenceName = "inventory_inventory_id_seq", allocationSize=1)
	private int inventoryId;
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	@Column(name = "last_update")
	private Date lastUpdate;
	
	public Inventory() {
		
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}

