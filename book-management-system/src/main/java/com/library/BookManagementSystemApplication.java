package com.library;

import com.library.entity.book;
import com.library.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;


@SpringBootApplication
public class BookManagementSystemApplication implements CommandLineRunner {


	public static void main(String[] args) {

		SpringApplication.run(BookManagementSystemApplication.class, args);
	}

	@Autowired
	private bookRepository bookrepository;

	@Override
	public void run(String... args) throws Exception {
//		LocalDate date1 = LocalDate.of(1954, 7, 29);
//		LocalDate date2 = LocalDate.of(1997, 6, 26);
//		LocalDate date3 = LocalDate.of(2003, 3, 18);
//
//		book book1 = new book(4L, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", date1);
//		book book2 = new book(5L, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy", date2);
//		book book3 = new book(6L, "The Da Vinci Code", "Dan Brown", "Thriller", date3);
//
//		bookrepository.save(book1);
//		bookrepository.save(book2);
//		bookrepository.save(book3);
	}
}
