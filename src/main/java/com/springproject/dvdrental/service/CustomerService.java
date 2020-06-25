package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(int id);
	void deleteCustomer(int id);
}
