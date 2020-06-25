package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Inventory;

public interface InventoryService {
	List<Inventory> getAllInventories();
	void saveInventory(Inventory inventory);
	Inventory getInventoryById(int id);
	void deleteInventory(int id);
}
