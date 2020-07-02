package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Inventory;

public interface InventoryService {
	List<Inventory> getAllInventories();
	Inventory saveInventory(Inventory inventory);
	Inventory getInventoryById(int id);
	void deleteInventory(int id);
}
