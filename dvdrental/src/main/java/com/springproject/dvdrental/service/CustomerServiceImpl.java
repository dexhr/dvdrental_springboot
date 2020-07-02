package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Customer;
import com.springproject.dvdrental.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> optional = customerRepository.findById(id);
		Customer customer = null;
		if(optional.isPresent()) {
			customer = optional.get();
		}
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.delete(getCustomerById(id));
	}
	
}
