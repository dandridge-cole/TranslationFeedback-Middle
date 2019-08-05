package com.translationfeedback.models;

import javax.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private TranslationFragment translationFragment;

    private Integer fragmentIndexStart;
    private Integer fragmentIndexEnd;

    private Boolean approved;
    private String suggestion;
    private String description;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public TranslationFragment getTranslationFragment() {return translationFragment;}
    public void setTranslationFragment(TranslationFragment translationFragment) {this.translationFragment = translationFragment;}
    public Integer getFragmentIndexStart() {return fragmentIndexStart;}
    public void setFragmentIndexStart(Integer fragmentIndexStart) {this.fragmentIndexStart = fragmentIndexStart;}
    public Integer getFragmentIndexEnd() {return fragmentIndexEnd;}
    public void setFragmentIndexEnd(Integer fragmentIndexEnd) {this.fragmentIndexEnd = fragmentIndexEnd;}
    public Boolean getApproved() {return approved;}
    public void setApproved(Boolean approved) {this.approved = approved;}
    public String getSuggestion() {return suggestion;}
    public void setSuggestion(String suggestion) {this.suggestion = suggestion;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}
