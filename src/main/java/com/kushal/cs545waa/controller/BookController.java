package com.kushal.cs545waa.controller;

import com.kushal.cs545waa.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book(1, "To Kill a Mockingbird", "978-0061120084");
        Book book2 = new Book(2, "The Great Gatsby", "978-0743273565");
        Book book3 = new Book(3, "Harry Potter and the Sorcerer's Stone", "978-0590353427");
        Book book4 = new Book(4, "The Alchemist", "978-0062315007");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        return bookList;

    };

}
