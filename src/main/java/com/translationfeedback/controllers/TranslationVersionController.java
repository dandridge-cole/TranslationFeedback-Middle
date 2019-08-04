package com.translationfeedback.controllers;

import com.translationfeedback.models.TranslationVersion;
import com.translationfeedback.services.TranslationVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TranslationVersionController {

    private TranslationVersionService translationVersionService;

    @Autowired
    public TranslationVersionController(TranslationVersionService translationVersionService){
        this.translationVersionService=translationVersionService;
    }

    @GetMapping("/version/{id}")
    public TranslationVersion getVersionById(@PathVariable Long id){
        return this.translationVersionService.getTranslationVersionById(id);
    }

    @GetMapping("/roots/{rootid}/versions")
    public List<TranslationVersion> getVersionsByRootId(@PathVariable Long rootId){
        return this.translationVersionService.getTranslationVersionsByRoot(rootId);
    }

    @PostMapping("/versions")
    public TranslationVersion createTranslationVersion(@RequestBody TranslationVersion translationVersion){
        return this.translationVersionService.createTranslationVersion(translationVersion);
    }
}
