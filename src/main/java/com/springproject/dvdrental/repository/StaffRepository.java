package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.dvdrental.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
