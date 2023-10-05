package com.kushal.cs545waa.controller;

import com.kushal.cs545waa.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    List<Book> bookList = new ArrayList<>();

    {
        Book book1 = new Book(1, "To Kill a Mockingbird", "978-0061120084");
        Book book2 = new Book(2, "The Great Gatsby", "978-0743273565");
        Book book3 = new Book(3, "Harry Potter and the Sorcerer's Stone", "978-0590353427");
        Book book4 = new Book(4, "The Alchemist", "978-0062315007");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookList;
    }

    @GetMapping(value = "{id}", produces = "application/cs.miu.edu-v1+json")
    public Book getBook(@PathVariable int id) {
        Book book = null;
        for (Book b : bookList) {
            if (b.getId() == id) {
                book = b;
                break;
            }
        }
        return book;
    }

    @GetMapping(value = "{id}", produces = "application/cs.miu.edu-v2+json")
    public Optional<Book> getBookV2(@PathVariable int id) {
        return bookList.stream()
                       .filter(book -> book.getId() == id)
                       .findFirst();
    }

    @PostMapping(headers = "X-API-VERSION=1")
    public Book addBookV1(@RequestBody Book bookRequest) {
        bookList.add(bookRequest);
        return bookList.get(bookList.size() - 1);
    }

    @PostMapping(headers = "X-API-VERSION=2")
    public Book addBookV2(@RequestBody Book bookRequest) {
        bookRequest.setIsbn("ISBN-" + bookRequest.getIsbn());
        bookList.add(bookRequest);
        return bookList.get(bookList.size() - 1);
    }

    @PutMapping("{id}")
    public Book updateBook(
            @PathVariable("id") int id,
            @RequestParam("version") int version,
            @RequestBody Book bookRequest
    ) {
        if (version == 1) {
            Book book = null;
            for (Book b : bookList) {
                if (b.getId() == id) {
                    b.setId(bookRequest.getId());
                    b.setIsbn(bookRequest.getIsbn());
                    b.setTitle(bookRequest.getTitle());
                    book = b;
                    break;
                }
            }
            return book;
        } else {
            Optional<Book> optionalBook = bookList.stream()
                                                  .filter(book -> book.getId() == id)
                                                  .findFirst();
            Book book = new Book();
            if (optionalBook.isPresent()) {
                book = optionalBook.get();
                book.setId(optionalBook.get()
                                       .getId());
                book.setTitle(bookRequest.getTitle());
                book.setIsbn(bookRequest.getIsbn());
            }
            return book;
        }

    }

    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable("id") int id) {
        bookList.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .ifPresent(bookList::remove);
    }
}
