package com.springproject.dvdrental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dvdrental.model.Language;
import com.springproject.dvdrental.repository.LanguageRepository;

@Service
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	private LanguageRepository languageRepository;
	
	@Override
	public List<Language> getAllLanguages() {
		// TODO Auto-generated method stub
		List<Language> languageList = languageRepository.findAll();
		return languageList;
	}

	@Override
	public Language saveLanguage(Language language) {
		// TODO Auto-generated method stub
		return languageRepository.save(language);
	}

	@Override
	public Language getLanguageById(int id) {
		// TODO Auto-generated method stub
		Optional<Language> optional = languageRepository.findById(id);
		Language language = null;
		if(optional.isPresent()) {
			language = optional.get();
		}else {
			throw new RuntimeException("Not found id: " + id);
		}
		return language;
	}

	@Override
	public void deleteLanguage(int id) {
		// TODO Auto-generated method stub
		languageRepository.delete(getLanguageById(id));
	}

}
