package org.lessons.java.thymeleaf.best_of_the_year.model;

import java.io.Serializable;

public class Movie implements Serializable {

    private String id;
    private String title;

    public Movie() {
    }

    public Movie(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
}
