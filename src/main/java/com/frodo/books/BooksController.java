package com.frodo.books;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BooksController {
    private final BooksRepository repository;
    BooksController(BooksRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    Collection<Book> findAllBooks() {
        return this.repository.findAll();
    }

    @PostMapping("/books")
    Collection<Book> addBook(@RequestBody  Book book) {
        Collection<Book> isbn = repository.findByIsbn(book.isbn());
        if (isbn.size() == 0) {
            this.repository.save(book);
        } else {
            System.out.println("book already added");
        }
        return this.repository.findAll();
    }
}
