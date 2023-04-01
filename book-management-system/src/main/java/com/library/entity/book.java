package com.library.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "books")
public class  book {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String author;
    private String genre;
    private LocalDate publication_date;


    public book() {
    }

    public book(Long id, String title, String author, String genre, LocalDate publication_date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publication_date = publication_date;
    }

    public book(String title, String author, String genre, LocalDate publication_date) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publication_date = publication_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(LocalDate publication_date) {
        this.publication_date = publication_date;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publication_date=" + publication_date +
                '}';
    }

}
