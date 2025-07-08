package org.lessons.java.thymeleaf.best_of_the_year.model;

import java.io.Serializable;

public class Song implements Serializable {

    private String id;
    private String title;
    private String author;

    public Song() {
    }

    public Song(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor(String newAuthor) {
        return this.author;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
}
