package com.translationfeedback.services;

import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.repositories.TranslationFragmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationFragmentService {

    private TranslationFragmentRepository translationFragmentRepository;

    @Autowired
    public TranslationFragmentService(TranslationFragmentRepository translationFragmentRepository){this.translationFragmentRepository=translationFragmentRepository;}

    public List<TranslationFragment> getAllFragmentsByVersionId(Integer versionId){
        return this.translationFragmentRepository.findAllByTranslationVersionOrderByOrigTextIndexStart(versionId);
    }

}
