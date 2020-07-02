package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Inventory;
import com.springproject.dvdrental.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryRepository inventoryRepository; 
	
	@Override
	public List<Inventory> getAllInventories() {
		// TODO Auto-generated method stub
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory saveInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return inventoryRepository.save(inventory);
	}

	@Override
	public Inventory getInventoryById(int id) {
		// TODO Auto-generated method stub
		Optional<Inventory> optional = inventoryRepository.findById(id);
		Inventory inventory = null;
		if(optional.isPresent()) {
			inventory = optional.get();
		}
		return inventory;
	}

	@Override
	public void deleteInventory(int id) {
		// TODO Auto-generated method stub
		inventoryRepository.delete(getInventoryById(id));
	}

}
