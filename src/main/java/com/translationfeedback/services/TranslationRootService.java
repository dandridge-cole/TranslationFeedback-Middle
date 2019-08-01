package com.translationfeedback.services;

import com.translationfeedback.repositories.TranslationRootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationRootService {

    private TranslationRootRepository translationRootRepository;

    @Autowired
    public TranslationRootService(TranslationRootRepository translationRootRepository){this.translationRootRepository=translationRootRepository;}

}
