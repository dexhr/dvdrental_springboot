package com.springproject.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springproject.dvdrental.model.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{

}
