package com.bootcoding.basic.Abstraction.BOOK;

import com.bootcoding.basic.Abstraction.BOOK.Book;

public class Ebook extends Book {
    @Override
    void purchase(double amount) {
        title="ebook";
        author="h&m";
        publisher="tablet";
    }
}