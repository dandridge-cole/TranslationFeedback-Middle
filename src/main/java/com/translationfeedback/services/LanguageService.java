package com.translationfeedback.services;

import com.translationfeedback.models.Language;
import com.translationfeedback.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository){this.languageRepository=languageRepository;}

    public Language addLanguage(Language language){return this.languageRepository.save(language);}
    public List<Language> getLanguagesListAll(){return this.languageRepository.findAll();}
    Language getLanguageByName(String name){return this.languageRepository.getByName(name);}
}
