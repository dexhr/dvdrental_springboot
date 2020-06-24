package com.springproject.dvdrental.service;

import java.util.List;

import com.springproject.dvdrental.model.Language;

public interface LanguageService {
	List<Language> getAllLanguages();
	void saveLanguage(Language language);
	Language getLanguageById(int id);
	void deleteLanguage(int id);
}
