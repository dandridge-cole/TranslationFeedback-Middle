package com.translationfeedback.models;

import javax.persistence.*;

@Entity
public class OrigText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private String publication;

    @ManyToOne
    private Language language;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getPublication() {return publication;}
    public void setPublication(String publication) {this.publication = publication;}
    public Language getLanguage() {return language;}
    public void setLanguage(Language language) {this.language = language;}
}
