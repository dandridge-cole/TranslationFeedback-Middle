package com.translationfeedback.controllers;

import com.translationfeedback.models.OrigText;
import com.translationfeedback.services.OrigTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrigTextController {

    private OrigTextService origTextService;

    @Autowired
    public OrigTextController(OrigTextService origTextService){this.origTextService=origTextService;}

    @GetMapping("/origtexts")
    public List<OrigText> getAllOrigTexts(){
        return this.origTextService.getAllOrigTexts();
    }

    @PostMapping("/origtexts")
    public OrigText addNewOrigText(@RequestBody OrigText origText){
        return this.origTextService.addNewOrigText(origText);
    }

    @GetMapping("/languages/{lang}/origtexts")
    public List<OrigText> getAllOrigTextsByLang(@PathVariable String lang){
        return this.origTextService.getAllOrigTextsByLang(lang);
    }

    @GetMapping("/origtexts/{name}")
    public OrigText getOrigTextByName(@PathVariable String name){
        return this.origTextService.getOrigTextByName(name);
    }
}
