package com.translationfeedback.models;

import javax.persistence.*;

@Entity
public class TranslationRoot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private OrigText origText;

    @ManyToOne
    private Language language;

    private String name;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public OrigText getOrigText() {return origText;}
    public void setOrigText(OrigText origText) {this.origText = origText;}
    public Language getLanguage() {return language;}
    public void setLanguage(Language language) {this.language = language;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
