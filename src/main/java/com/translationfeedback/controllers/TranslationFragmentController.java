package com.translationfeedback.controllers;

import com.translationfeedback.models.TranslationFragment;
import com.translationfeedback.services.TranslationFragmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TranslationFragmentController {

    private TranslationFragmentService translationFragmentService;

    @Autowired
    public TranslationFragmentController(TranslationFragmentService translationFragmentService){
        this.translationFragmentService=translationFragmentService;
    }

    @GetMapping("/fragments/{id}")
    public TranslationFragment getFragmentById(@PathVariable Long id){
        return this.translationFragmentService.getFragmentById(id);
    }

    @GetMapping("/versions/{versionId}/fragments")
    public List<TranslationFragment> getFragmentsByVersionId(@PathVariable Long versionId){
        return this.translationFragmentService.getAllFragmentsByVersionId(versionId);
    }

    @PostMapping("/fragments")
    public TranslationFragment createFragment(@RequestBody TranslationFragment translationFragment){
        return this.translationFragmentService.createTranslationFragment(translationFragment);
    }
}
