package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springproject.dvdrental.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
