package com.translationfeedback.services;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.OrigText;
import com.translationfeedback.models.TranslationRoot;
import com.translationfeedback.repositories.TranslationRootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationRootService {

    private TranslationRootRepository translationRootRepository;
    private LanguageService languageService;
    private OrigTextService origTextService;

    @Autowired
    public TranslationRootService(TranslationRootRepository translationRootRepository, LanguageService languageService, OrigTextService origTextService){
        this.translationRootRepository=translationRootRepository;
        this.languageService=languageService;
        this.origTextService=origTextService;
    }

    public List<TranslationRoot> getTranslationRootsByOrigText(Long origTextId){
        OrigText origText = this.origTextService.getOrigTextById(origTextId);
        return this.translationRootRepository.findAllByOrigText(origText);
    }

    public TranslationRoot createTranslationRoot(TranslationRoot translationRoot){
        return this.translationRootRepository.save(translationRoot);
    }

    public TranslationRoot getRootById(Long id){
        return this.translationRootRepository.getById(id);
    }

    public List<TranslationRoot> getAllTranslationRootsByLang(String lang){
        Language language = this.languageService.getLanguageByName(lang);
        return this.translationRootRepository.findAllByLanguage(language);
    }
}
