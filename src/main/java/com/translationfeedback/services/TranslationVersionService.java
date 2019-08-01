package com.translationfeedback.services;

import com.translationfeedback.repositories.TranslationVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationVersionService {

    private TranslationVersionRepository translationVersionRepository;

    @Autowired
    public TranslationVersionService(TranslationVersionRepository translationVersionRepository){this.translationVersionRepository=translationVersionRepository;}

}
