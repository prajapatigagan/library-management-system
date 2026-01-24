package com.library.model;

public class Book {
    private String title;
    private int id;
    private String author;

    public Book(String title, int id, String author) {
        this.title=title;
        this.id = id;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public String getauthor() {
        return author;
    }
    public String toString(){
        return "Title: "+title+ " |Id: "+id+" |Author: "+author;
    }
}
