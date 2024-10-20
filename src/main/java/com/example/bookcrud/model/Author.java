package com.example.bookcrud.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private List<Book> books;
    private String email;

    public Author() {

    }

    public Author(Long id, String name, List<Book> books, String email) {
        this.id = id;
        this.name = name;
        this.books = books;
    }


}
