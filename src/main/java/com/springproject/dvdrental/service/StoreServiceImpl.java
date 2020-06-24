package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Store;
import com.springproject.dvdrental.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public List<Store> getAllStores() {
		// TODO Auto-generated method stub
		return storeRepository.findAll();
	}

	@Override
	public void saveStore(Store store) {
		// TODO Auto-generated method stub
		storeRepository.save(store);
	}

	@Override
	public Store getStoreById(int id) {
		// TODO Auto-generated method stub
		Optional<Store> optional = storeRepository.findById(id);
		Store store  = null;
		if(optional.isPresent()) {
			store = optional.get();
		}
		return store;
	}

	@Override
	public void deleteStore(int id) {
		// TODO Auto-generated method stub
		storeRepository.delete(getStoreById(id));
	}

}
