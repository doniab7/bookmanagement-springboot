package com.library.service.impl;

import com.library.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.repository.bookRepository;
import com.library.service.bookService;

import java.util.List;

@Service
public class bookServiceImpl implements bookService {

final private bookRepository bookrepository;

@Autowired
    public bookServiceImpl(bookRepository bookrepository) {
        this.bookrepository = bookrepository;
    }

    @Override
    public List<book> getAllBooks() {
        return bookrepository.findAll();
    }

    @Override
    public book saveBook(book b) {
        return bookrepository.save(b);
    }

    @Override
    public book getBookById(Long id) {
        boolean present = bookrepository.findById(id).isPresent();
        if (present)
            return bookrepository.findById(id).get();

        return null;
    }

    @Override
    public book updateBook(book b) {
        return bookrepository.save(b);
    }

    @Override
    public void deleteBookById(Long id) {
        bookrepository.deleteById(id);
    }

}
