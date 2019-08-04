package com.translationfeedback.services;

import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.models.TranslationVersion;
import com.translationfeedback.repositories.TranslationFragmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationFragmentService {

    private TranslationFragmentRepository translationFragmentRepository;
    private TranslationVersionService translationVersionService;

    @Autowired
    public TranslationFragmentService(TranslationFragmentRepository translationFragmentRepository, TranslationVersionService translationVersionService){
        this.translationFragmentRepository=translationFragmentRepository;
        this.translationVersionService=translationVersionService;
    }

    public List<TranslationFragment> getAllFragmentsByVersionId(Long versionId){
        TranslationVersion translationVersion = this.translationVersionService.getTranslationVersionById(versionId);
        return this.translationFragmentRepository.findAllByTranslationVersionOrderByOrigTextIndexStart(translationVersion);
    }

    public TranslationFragment createTranslationFragment(TranslationFragment translationFragment){
        return this.translationFragmentRepository.save(translationFragment);
    }

    public TranslationFragment getFragmentById(Long id){
        return this.translationFragmentRepository.getById(id);
    }

}
