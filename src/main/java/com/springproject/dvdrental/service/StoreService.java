package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Store;

public interface StoreService {
	List<Store> getAllStores();
	void saveStore(Store store);
	Store getStoreById(int id);
	void deleteStore(int id);
}
