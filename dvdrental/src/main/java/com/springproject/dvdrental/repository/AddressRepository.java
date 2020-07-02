package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
