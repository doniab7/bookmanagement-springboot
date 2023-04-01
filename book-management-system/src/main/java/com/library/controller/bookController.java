package com.library.controller;


import com.library.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.library.service.bookService;

import java.util.List;


@Controller
@RequestMapping("/api/book-management")
public class bookController {

final private bookService bookservice;

@Autowired
    public bookController(bookService bookservice) {
        this.bookservice = bookservice;
    }


    @GetMapping("/books")
  public ResponseEntity<List<book>> readAllBooks(){
    List<book> booklist = bookservice.getAllBooks();
        return new ResponseEntity<>(booklist, HttpStatus.OK);

    }

    @GetMapping("/book/{id}")
  public ResponseEntity<book> readBookById(@PathVariable("id") Long id ){
    book b = bookservice.getBookById(id);
    if (b == null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
        return new ResponseEntity<>(b, HttpStatus.OK);
    }


    @PostMapping("/book/add")
    @ResponseStatus(HttpStatus.CREATED)
  public void createBook(@RequestBody book newbook){
     bookservice.saveBook(newbook);
    }


    @PutMapping("/book/{id}")
    public ResponseEntity<book> updateBook(@PathVariable("id") Long id ,@RequestBody book updatedbook){
    book b = bookservice.getBookById(id);
    if (b == null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(bookservice.updateBook(updatedbook), HttpStatus.OK);
    }


    @DeleteMapping("/book/{id}")
    public ResponseEntity<book> deleteBook(@PathVariable("id") Long id){
    book b = bookservice.getBookById(id);
    if (b == null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    bookservice.deleteBookById(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }


}




