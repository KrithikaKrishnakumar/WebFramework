package com.cl4.cw4.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class Book {
    private String title;
    private String author;
    private LocalDate pubDate;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPub() {
        return pubDate;
    }
    public void setPub(LocalDate pubDate) {
        this.pubDate=pubDate;
    }
    

}
