package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Address;

public interface AddressService {
	List<Address> getAllAddresses();
	void saveAddress(Address address);
	Address getAddressById(int id);
	void deleteAddress(int id);
}
