package com.diiage.guillaumebidault.tp1auto.beans;

import android.database.Cursor;

public class Books {
    private int id;
    private String title;
    private String author;
    private String genre;

    public Books(Cursor cursor) {
        id = cursor.getInt(0);
        title=cursor.getString(1);
        author=cursor.getString(2);
        genre=cursor.getString(3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
