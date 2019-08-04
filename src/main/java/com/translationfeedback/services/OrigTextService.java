package com.translationfeedback.services;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.OrigText;
import com.translationfeedback.repositories.OrigTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigTextService {

    private OrigTextRepository origTextRepository;
    private LanguageService languageService;

    @Autowired
    public OrigTextService(OrigTextRepository origTextRepository, LanguageService languageService){
        this.origTextRepository=origTextRepository;
        this.languageService=languageService;
    }

    public List<OrigText> getAllOrigTexts(){
        return this.origTextRepository.findAll();
    }

    public OrigText getOrigTextByName(String name){
        return this.origTextRepository.getByName(name);
    }

    public OrigText getOrigTextById(Long id){
        return this.origTextRepository.getById(id);
    }

    public OrigText addNewOrigText(OrigText origText){
        return this.origTextRepository.save(origText);
    }

    public List<OrigText> getAllOrigTextsByLang(String lang){
        Language language = this.languageService.getLanguageByName(lang);
        return this.origTextRepository.findAllByLanguage(language);
    }
}
