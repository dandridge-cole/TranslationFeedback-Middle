package com.translationfeedback.controllers;

import com.translationfeedback.models.Language;
import com.translationfeedback.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService){
        this.languageService=languageService;
    }

    @GetMapping("/languages")
    List<Language> getAllLanguages(){
        return this.languageService.getLanguagesListAll();
    }

    @PostMapping("/languages")
    Language addNewLanguage(@RequestBody Language language){
        return this.languageService.addLanguage(language);
    }
}
