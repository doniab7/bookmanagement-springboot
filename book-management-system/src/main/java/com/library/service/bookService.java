package com.library.service;

import com.library.entity.book;

import java.util.List;

public interface bookService {

    List<book> getAllBooks();
    book saveBook(book b);

    book getBookById(Long id);
    book updateBook(book b);

    void deleteBookById(Long id);
}
