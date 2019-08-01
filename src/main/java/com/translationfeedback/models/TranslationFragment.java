package com.translationfeedback.models;

import javax.persistence.*;

@Entity
public class TranslationFragment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private TranslationVersion translationVersion;

    private Integer origTextIndexStart;
    private Integer origTextIndexEnd;
    private String content;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public TranslationVersion getTranslationVersion() {return translationVersion;}
    public void setTranslationVersion(TranslationVersion translationVersion) {this.translationVersion = translationVersion;}
    public Integer getOrigTextIndexStart() {return origTextIndexStart;}
    public void setOrigTextIndexStart(Integer origTextIndexStart) {this.origTextIndexStart = origTextIndexStart;}
    public Integer getOrigTextIndexEnd() {return origTextIndexEnd;}
    public void setOrigTextIndexEnd(Integer origTextIndexEnd) {this.origTextIndexEnd = origTextIndexEnd;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
}
