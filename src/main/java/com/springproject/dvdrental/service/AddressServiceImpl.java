package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Address;
import com.springproject.dvdrental.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}

	@Override
	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		Optional<Address> optional = addressRepository.findById(id);
		Address address = null;
		if(optional.isPresent()) {
			address = optional.get();
		}
		return address;
	}

	@Override
	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		addressRepository.delete(getAddressById(id));
	}

}
