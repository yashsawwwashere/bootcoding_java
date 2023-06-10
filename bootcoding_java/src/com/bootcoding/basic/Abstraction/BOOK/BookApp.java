package com.bootcoding.basic.Abstraction.BOOK;


public class BookApp {
    public static void main(String[] args) {
        AudioBook abook=new AudioBook();
        Ebook ebook=new Ebook();
        Textbook textbook=new Textbook();

        abook.purchase(10);
        ebook.purchase(10);
        textbook.purchase(10);

        print(abook);
        print(ebook);
        print(textbook);


    }
    public static void print(Book book){
        book.print();
    }
}
