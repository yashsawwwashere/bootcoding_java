package com.bootcoding.basic.Abstraction.BOOK;

import com.bootcoding.basic.constructor.Author;
import com.bootcoding.basic.constructor.Publication;

public abstract class Book {
    public String title;
    public String author;
    public String publisher;
    abstract void purchase(double amount); // declare with no implementation

    public void print(){ // declare + implementation
        System.out.println("Book: life after death");
        System.out.println(title);
        System.out.println(author);
        System.out.println(publisher);
    }
}
