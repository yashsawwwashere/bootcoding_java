package com.bootcoding.oops;

import java.sql.SQLOutput;

public class Book {
    String title;
    String description;
    String author;
    String publisherName;
    int pages;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void buy(){
        System.out.println("buy");


    }
    public void sell(){
        System.out.println("sell");

    }

    public Book() {
        System.out.println("prashil");;
    }

    public String book(String a){
        String name=a;


        return a;
    }

}

