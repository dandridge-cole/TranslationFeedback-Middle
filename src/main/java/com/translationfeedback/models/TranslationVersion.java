package com.translationfeedback.models;

import javax.persistence.*;

@Entity
public class TranslationVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private TranslationRoot translationRoot;

    private Integer version;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public TranslationRoot getTranslationRoot() {return translationRoot;}
    public void setTranslationRoot(TranslationRoot translationRoot) {this.translationRoot = translationRoot;}
    public Integer getVersion() {return version;}
    public void setVersion(Integer version) {this.version = version;}
}
