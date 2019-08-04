package com.translationfeedback.controllers;

import com.translationfeedback.models.TranslationRoot;
import com.translationfeedback.services.TranslationRootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TranslationRootController {

    private TranslationRootService translationRootService;

    @Autowired
    public TranslationRootController(TranslationRootService translationRootService){this.translationRootService=translationRootService;}

    @GetMapping("/origtexts/{origTextId}/translationroots")
    public List<TranslationRoot> getTranslationRootsByOrigText(@PathVariable Long origTextId){
        return this.translationRootService.getTranslationRootsByOrigText(origTextId);
    }

    @GetMapping("/languages/{lang}/translationroots")
    public List<TranslationRoot> getTranslationRootsByLang(@PathVariable String lang){
        return this.translationRootService.getAllTranslationRootsByLang(lang);
    }

    @PostMapping("/translationroots")
    public TranslationRoot createTranslationRoot(TranslationRoot translationRoot){
        return this.translationRootService.createTranslationRoot(translationRoot);
    }
}
