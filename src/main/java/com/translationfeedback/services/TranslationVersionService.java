package com.translationfeedback.services;

import com.translationfeedback.models.TranslationRoot;
import com.translationfeedback.models.TranslationVersion;
import com.translationfeedback.repositories.TranslationVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationVersionService {

    private TranslationVersionRepository translationVersionRepository;
    private TranslationRootService translationRootService;

    @Autowired
    public TranslationVersionService(TranslationVersionRepository translationVersionRepository, TranslationRootService translationRootService){
        this.translationVersionRepository=translationVersionRepository;
        this.translationRootService=translationRootService;
    }

    public TranslationVersion getTranslationVersionById(Long id){
        return this.translationVersionRepository.getOne(id);
    }

    public List<TranslationVersion> getTranslationVersionsByRoot(Long rootId){
        TranslationRoot translationRoot = this.translationRootService.getRootById(rootId);
        return this.translationVersionRepository.findAllByTranslationRoot(translationRoot);
    }

    public TranslationVersion createTranslationVersion(TranslationVersion version){
        return this.translationVersionRepository.save(version);
    }
}
